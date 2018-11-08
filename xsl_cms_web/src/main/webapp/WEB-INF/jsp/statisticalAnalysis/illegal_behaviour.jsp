<%--
  Created by IntelliJ IDEA.
  User: 王坤
  Date: 2018/10/08
  Time: 下午 19:09
  Function : 查看时间段中的，违法行为的比例图
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8"/>
	<title>车流年历</title>
	<link rel="stylesheet" type="text/css" href="../../static/bootstrap-3.3.7-dist/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="../../static/bootstrap-3.3.7-dist/css/default.css">
	<link rel="stylesheet" type="text/css" href="../../static/bootstrap-3.3.7-dist/css/bootstrap-year-calendar.css">
    <link href="../../css/demo.css" rel="stylesheet" type="text/css"/>
    <script src="../../js/boot.js" type="text/javascript"></script>
    <script src="../../js/miniui/locale/zh_CN.js" type="text/javascript"></script>
    <style type="text/css">
		#calendar{
			width: 100%;
			height: 100%;
			overflow: hidden;
		}
	</style>
</head>
<body>
<div id="calendar"></div>

<script src="../../js/jquery.min.js"></script>
<script type="text/javascript" src="../../static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script type="text/javascript" src="../../static/bootstrap-3.3.7-dist/js/bootstrap-datepicker.min.js"></script>
<script type="text/javascript" src="../../static/bootstrap-3.3.7-dist/js/bootstrap-year-calendar.js"></script>
<script type="text/javascript" src="../../static/bootstrap-3.3.7-dist/js/bootstrap-popover.js"></script>
<script type="text/javascript" src="../../static/bootstrap-3.3.7-dist/js/common_calendar.js"></script>
<script type="text/javascript">

    $(function() {
            var dataSource = null;
            // $.ajax({
            //     url:'/TrafficFlowMapper/year/date',
            //     type:'post',
            //     dataType:"json",
            //     contentType:"application/json;charset=utf-8",
            //     success : function (result) {
            //         dataSource = result;
            //     }
            // });
            $('#calendar').calendar({
            style:'background',
            clickDay:function(e){
                var years = e.date.getFullYear();
                var months = getDetails(e.date.getMonth());
                var days = getDetails(e.date.getDate());
                var time = years+'-'+months+'-'+days;
                mini.open({
                    targetWindow: window,
                    url: "/trafficFlow/day/chart?toDay="+time,
                    title: "", width: 800, height: 505,
                    allowResize: true
                });
			},
            mouseOnDay: function(e) {
                if(e.events.length > 0) {
                    var content = '';
                    for(var i in e.events) {
                        content += '<div class="event-tooltip-content">'
                            + '<div class="event-name" style="color:' + e.events[i].color + '">' + e.events[i].name + '</div>'
                            + '<div class="event-location">' + e.events[i].location + '</div>'
                            + '</div>';
                    }

                    $(e.element).popover({
                        trigger: 'manual',
                        container: 'body',
                        html:true,
                        content: content
                    });

                    $(e.element).popover('show');
                }
            },
            mouseOutDay: function(e) {
                if(e.events.length > 0) {
                    $(e.element).popover('hide');
                }
            },
            dataSource: [
                {
                    "name": '0',
                    "startDate": new Date(2018, 4, 28),
                    "endDate": new Date(2018, 4, 28),
					"color":'Yellow'
                },
                {
                    "name": 'Microsoft Convergence',
                    "location": 'New Orleans, LA',
                    "startDate": new Date(2018, 2, 16),
                    "endDate": new Date(2018, 2, 19)
                }
            ]
        });
    });

    function getDetails(hours){
        if(hours >= 1 &&hours <= 9){
            hours = "0"+hours;
        }
        return hours;
    }

</script>
</body>
</html>