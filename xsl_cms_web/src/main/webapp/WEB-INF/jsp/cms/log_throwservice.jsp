<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2018/7/21
  Time: 10:29
  To change this template use File | Settings | File Templates.
  Service异常日志
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Service 异常日志</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
    <link href="../../css/demo.css" rel="stylesheet" type="text/css" />
    <script src="../../js/boot.js" type="text/javascript"></script>
    <script src="../../js/miniui/locale/en_US.js" type="text/javascript"></script>
    <script src="../../js/ColumnsMenu.js" type="text/javascript"></script>
</head>
<body>
<div class="mini-fit">
<div id="datagrid1" class="mini-datagrid" style="height:380px;"
     url="/log/service/list" idField="id"
     allowResize="true" pageSize="10"
     allowCellEdit="true" allowCellSelect="true" multiSelect="true"
     editNextOnEnterKey="true"  editNextRowCell="true"

>
    <div property="columns">
        <div type="indexcolumn"></div>
        <div name="id"  field="id" align="center" headerAlign="center" allowSort="true" width="50" >ID</div>
        <div name="ip"  field="ip" align="center" headerAlign="center" allowSort="true" width="100" >操作IP</div>
        <div name="throwing"  field="throwing" align="center" headerAlign="center" allowSort="true" width="250" >异常操作</div>
        <div name="operationer"  field="operationer" align="center" headerAlign="center" allowSort="true" width="150" >操作人员</div>
        <div name="throwingtime" field="throwingtime" align="center" headerAlign="center" width="150" allowSort="true" dateFormat="yyyy-MM-dd hh:mm:ss">异常时间</div>
    </div>
</div>
</div>
<script src="../../js/operation.js" type="text/javascript"></script>
</body>
</html>
