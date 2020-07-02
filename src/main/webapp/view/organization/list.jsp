<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>数据字典展示列表页面</title>
    <%@ include file="../../common/jsp/header.jsp"%>
</head>
<body>
<div class="wrapper wrapper-content animated fadeInRight">
    <div class="ibox float-e-margins">
        <form id="searchForm" action="">
            <div class="col-sm-12">
                <!-- ------------按钮组 start------------ -->
                <div class="alert alert-success" role="alert">机构信息</div>
                <div class="col-sm-8">
                    <div class="btn-group hidden-xs" role="group">
                        <button type="button" class="btn btn-primary" data-toggle="modal" id="create" name="organization/create.jsp">
                            <i class="glyphicon glyphicon-plus" aria-hidden="true"></i>添加
                        </button>
                        <button type="button" class="btn btn-success" data-toggle="modal" id="update" name="dictionary/view.do">
                            <i class="glyphicon glyphicon-pencil" aria-hidden="true"></i>修改
                        </button>
                        <button type="button" class="btn btn-danger" data-toggle="modal" id="delete" name="organization/query.do">
                            <i class="glyphicon glyphicon-trash" aria-hidden="true"></i>删除
                        </button>
                    </div>
                </div>
                <div class="col-sm-4">
                    <input class="form-control" id="search" name="dataName" value="${entity.organizationName }" type="text" placeholder="查询内容 回车搜索"/>
                </div>
                <!-- ------------按钮组 end------------ -->
                <input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
                <input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
                <table class="table table-striped table-bordered table-hover table-condensed">
                    <thead>
                    <tr>
                        <th><input type="checkbox" id="checkall"/></th>
                        <th>机构名称</th>
                        <th>机构地址</th>
                        <th>联系人</th>
                        <th>电话</th>
                        <th>国家</th>
                        <th>省份</th>
                        <th>城市</th>
                        <th>经办人</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:set var="vs"></c:set>
                    <c:forEach  var="e" items="${page.list }" varStatus="v">
                        <input id="code1" type="hidden" value="${e.liuContractEntities.size()}"></input>
                        <tr>
                            <td><input type="checkbox" name="ids" value="${e.id }"/></td>
                            <td>${e.organizationName }</td>
                            <td>${e.organizationAddress }</td>
                            <td id="code">${e.liuContractEntities[0].name}</td>
                            <td>${e.liuContractEntities[0].mobilePhone}</td>
                            <td>${e.country }</td>
                            <td>${e.province}</td>
                            <td>${e.city }</td>
                            <td>${e.liuContractEntities[0].employeeEntity.employeeName}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
                <div class="page">${page}</div>
            </div>
        </form>
    </div>
</div>
</body>

<%--<script type="text/javascript" src="${path}/view/organization/js/organizationlist.js"></script>--%>
</html>
<script>
    $(function () {
        $(document).ready(function(){
            $("#code").append("(目前有"+$("#code1").val()+"人)");
        });
    })
</script>