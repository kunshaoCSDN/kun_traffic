<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2018/7/19
  Time: 9:29
  To change this template use File | Settings | File Templates.
  任务展示页面
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>任务展示 </title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
    <link href="../../css/demo.css" rel="stylesheet" type="text/css" />

    <script src="../../js/boot.js" type="text/javascript"></script>
    <script src="../../js/miniui/locale/en_US.js" type="text/javascript"></script>
    <script src="../../js/ColumnsMenu.js" type="text/javascript"></script>
</head>
<body>
<div class="mini-fit">
    <div class="mini-toolbar" style="border-bottom:0;padding:0px;">
        <table style="width:100%;">
            <tr>
                <td style="width:100%;">
                    <a class="mini-button" iconCls="icon-add" onclick="addRow()" plain="true" tooltip="增加...">增加</a>
                    <a class="mini-button" iconCls="icon-remove" onclick="removeRow('/task/show/delete')" plain="true">删除</a>
                    <span class="separator"></span>
                    <a class="mini-button" iconCls="icon-save" onclick="saveData('/task/show')" plain="true">保存</a>
                </td>
                <td style="white-space:nowrap;">
                    <input id="key" class="mini-textbox" emptyText="请输入任务ID" style="width:150px;" onenter="onKeyEnter"/>
                    <input id="key1" class="mini-combobox" emptyText="请输入任务状态" style="width:150px;" url="../data/task_state.txt" onenter="onKeyEnter"/>
                    <a class="mini-button" onclick="search()">查询</a>
                </td>
            </tr>
        </table>
    </div>
<div id="datagrid1" class="mini-datagrid" style="height:380px;"
     url="/task/show/list" idField="id"
     allowResize="true" pageSize="10"
     allowCellEdit="true" allowCellSelect="true" multiSelect="true"
     editNextOnEnterKey="true"  editNextRowCell="true">
    <div property="columns">
        <div type="indexcolumn"></div>
        <div type="checkcolumn"></div>
        <div name="id"  field="id" headerAlign="center" allowSort="true" width="100" >任务ID</div>
        <div field="descr" width="150" allowSort="true" >任务描述
            <!-- 添加编辑信息 -->
            <input property="editor" class="mini-textarea"  style="width:100%;"/>
        </div>
        <div name="sendid" field="sendid" width="100" allowSort="true" >发送者ID
            <!-- 添加编辑信息 -->
            <input property="editor" class="mini-textbox" style="width:100%;"/>
        </div>
        <div field="money" width="100" headerAlign="center" allowSort="true">赏金
            <!-- 添加编辑信息 -->
            <input property="editor" class="mini-textbox" style="width:200px;" />
        </div>
        <!--ComboBox：远程数据,下面javascript的数组就是，因为不用改变，所以没有使用txt文件-->
        <div type="comboboxcolumn" field="state" width="100" headerAlign="center">状态
            <!-- 因为不能连接国家的库，所以写了一个txt,如需添加其他国籍，手动添加 -->
            <input property="editor" class="mini-combobox" style="width:100%;" url="../data/task_state.txt"/>
        </div>
        <div name="createdate" field="createdate" width="100" allowSort="true" dateFormat="yyyy-MM-dd">创建日期
            <!-- 添加编辑信息 -->
            <input property="editor" class="mini-datepicker" style="width:100%;"/>
        </div>
        <div name="updatedate" field="updatedate" width="100" allowSort="true" dateFormat="yyyy-MM-dd">更新日期
            <!-- 添加编辑信息 -->
            <input property="editor" class="mini-datepicker" style="width:100%;"/>
        </div>
        <div name="revokedate" field="revokedate" width="100" allowSort="true" dateFormat="yyyy-MM-dd">末任务时间
            <!-- 添加编辑信息 -->
            <input property="editor" class="mini-datepicker" style="width:100%;"/>
        </div>
    </div>
</div>
</div>
<script src="../../js/operation.js" type="text/javascript"></script>
</body>
</html>
