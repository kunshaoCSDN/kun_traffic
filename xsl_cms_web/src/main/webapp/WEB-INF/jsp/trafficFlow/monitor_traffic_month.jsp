<%--
  Created by IntelliJ IDEA.
  User: 王坤
  Date: 2018/10/06
  Time: 下午 16:16
  交通流量月段柱状图
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html style="height: 100%">
<head>
    <meta charset="utf-8">
</head>
<body>
<!-- 写一个表格的名字 -->
<div id="myChart" style="height: 100% ;height:450px;">
</div>
<script type="text/javascript" src="../../js/echarts.js">
</script>
<script type="text/javascript" src="../../js/jquery.min.js">
</script>
<script type="text/javascript">
        // 基于准备好的dom，初始化echarts图表
        var myChart = echarts.init(document.getElementById('myChart'));
        var option = null;
        //ajax传值
        $.ajax({
            url:"/trafficFlow/month/monitorCount",
            type:"post",
            contentType:"application/json;charset=UTF-8",
            dataType:"json",
            success:function(result){
                var xname = result.xname + "月车流量柱状图";
                option = {
                    title: {
                        text: xname,
                    },
                    color: {
                        type: 'bar',
                        x: 0,
                        y: 0,
                        x2: 0,
                        y2: 1,
                        colorStops: [{
                            offset: 0, color: 'blue' // 0% 处的颜色
                        }, {
                            offset: 1, color: 'red' // 100% 处的颜色
                        }],
                        globalCoord: false // 缺省为 false
                    },
                    tooltip: {
                        trigger: 'axis',
                        axisPointer: {
                            type: 'cross',
                            label: {
                                backgroundColor: '#44daff'
                            }
                        }
                    },
                    legend: {
                        data:['月车流量']
                    },
                    toolbox: {
                        show: true,
                        feature: {
                            dataView: {readOnly: false},
                            restore: {},
                            saveAsImage: {}
                        }
                    },
                    xAxis: [
                        {
                            name:'日',
                            type: 'category',
                            boundaryGap: true,
                            data: result.keys
                        }
                    ],
                    yAxis: [
                        {
                            type: 'value',
                            scale: true,
                            name: '辆',
                            boundaryGap: [0, '50%']  //Y 一直处于y轴的一半
                        }
                    ],
                    series: [     //添加数据
                        {
                            name:'月车流量',
                            type:'bar',
                            smooth:true,
                            areaStyle: {
                                normal: {}
                            },
                            symbol: 'none',
                            data: result.values
                        }
                    ]
                };
                myChart.setOption(option);
            }
        });
</script>
</body>
</html>
