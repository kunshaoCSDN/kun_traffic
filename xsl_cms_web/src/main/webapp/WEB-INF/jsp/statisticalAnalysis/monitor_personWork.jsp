<%--
  Created by IntelliJ IDEA.
  User: 王坤
  Date: 2018/10/29
  Time: 15:23
  Function : 工作人员工作的比例
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

     $.ajax({
         url:'/log/controller/personMonitor',
         dataType:'json',
         contentType:'application/json;charset=utf-8',
         type:'post',
         success : function (result) {
             option = {
                 tooltip : {
                     trigger: 'axis'
                 },
                 legend: {
                     data:['操作总数','删除总数']
                 },
                 toolbox: {
                     show : true,
                     feature : {
                         mark : {show: true},
                         dataView : {show: true, readOnly: false},
                         magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                         restore : {show: true},
                         saveAsImage : {show: true}
                     }
                 },
                 calculable : true,
                 xAxis : [
                     {
                         type : 'category',
                         boundaryGap : false,
                         data : ['管理员','非管理员']
                     }
                 ],
                 yAxis : [
                     {
                         type : 'value'
                     }
                 ],
                 series : [
                     {
                         name:'操作总数',
                         type:'line',
                         stack: '总量',
                         data:result.keys
                     },
                     {
                         name:'删除总数',
                         type:'line',
                         stack: '总量',
                         data:result.values
                     }
                 ]
             };
             myChart.setOption(option);
         }
     });
</script>
</body>

</html>
