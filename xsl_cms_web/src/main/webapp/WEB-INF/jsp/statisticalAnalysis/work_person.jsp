<%--
  Created by IntelliJ IDEA.
  User: 王坤
  Date: 2018/10/8
  Time: 13:14
  Function : 查询
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>人员工作量统计</title>
    <link href="../../static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="../../css/demo.css" rel="stylesheet" type="text/css" />
    <script src="../../js/boot.js" type="text/javascript"></script>
    <script src="../../js/miniui/locale/en_US.js" type="text/javascript"></script>
    <style type="text/css">
        #workTable tr th{
            text-align: center;
        }
        #workTable tr td{
            text-align: center;
        }
    </style>
    <script src="../../js/boot.js" type="text/javascript"></script>
    <script src="../../js/ColumnsMenu.js" type="text/javascript"></script>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-6">&nbsp;</div>
    </div>
    <div class="row">
        <div class="col-md-6">
            统计日期:从
            <input class="mini-datepicker" name="fromTime"/>
            到
            <input class="mini-datepicker" name="toTime"/>
        </div>
        <div class="col-md-5">
            用户类型:
            <label class="radio-inline">
                <input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1"> 录入人员
            </label>
            <label class="radio-inline">
                <input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2"> 审核人员
            </label>
        </div>
        <div class="col-md-1">
            <button type="button" class="btn btn-success">
                <span class="glyphicon glyphicon-search" aria-hidden="true"></span>
                查询
            </button>
        </div>
    </div>
    <div class="row">
        <div class="col-md-6">&nbsp;</div>
    </div>
    <%-- 表格部分 --%>
    <div class="row">
        <table class="table table-bordered" id="workTable">
            <thead>
            <tr>
                <th>所属权限</th>
                <th>操作总数</th>
                <th>删除总数</th>
            </tr>
            </thead>
            <tbody id="myBody">
            </tbody>
            <tfoot>
                <tr>
                    <td colspan="3">
                        <button type="button" class="btn btn-info" onclick="getMonitor()">
                            <span class="glyphicon glyphicon-stats" aria-hidden="true"></span>
                            统计图
                        </button>
                    </td>
                </tr>
            </tfoot>
        </table>
    </div>
</div>
</body>
</html>
<script src="../../js/jquery.min.js"></script>
<script src="../../static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script type="text/javascript">
    function getMonitor(){
        mini.open({
            targetWindow: window,
            url: "/log/controller/monitor",
            title: "", width: 800, height: 505
        });
    }

    $.ajax({
        url:'/log/controller/personWork',
        type:'post',
        contentType:'application/json;charset=utf-8',
        dataType:'json',
        success : function (result) {
            var tbody = $("#myBody");
            $.each(result,function (index,item) {
                tbody.append("<tr>\n" +
                    "                <th>"+ item.admin+"</th>\n" +
                    "                <th>"+ item.operationCount+"</th>\n" +
                    "                <th>"+ item.deleteCount+"</th>\n" +
                    "            </tr>")
            });
        }
    });
</script>
