<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%
    String organizationpath = request.getContextPath()+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <title>数据字典展示列表页面</title>
    <%@ include file="../../common/jsp/header.jsp"%>
</head>
<body>
<div class="wrapper wrapper-content animated fadeInRight">
    <div class="ibox float-e-margins">
        <form id="searchForm1" action=>
            <div class="col-sm-12">
                <!-- ------------按钮组 start------------ -->
                <div class="alert alert-success" role="alert">机构信息</div>
                <div class="col-sm-8">
                    <div class="btn-group hidden-xs" role="group">
                        <button type="button" class="btn btn-primary" data-toggle="modal" id="creates" name="organization/create.jsp">
                            <i class="glyphicon glyphicon-plus" aria-hidden="true"></i>添加
                        </button>
                        <button type="button" class="btn btn-danger" data-toggle="modal" id="deletes" name="organization/delete.do">
                            <i class="glyphicon glyphicon-trash" aria-hidden="true"></i>删除
                        </button>
                    </div>
                </div>
                <div class="col-sm-4">
                    <input class="form-control" id="search" name="organizationName" value="${entity.organizationName }" type="text" placeholder="查询内容 回车搜索"/>
                </div>
                <!-- ------------按钮组 end------------ -->
<%--                <input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>--%>
<%--                <input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>--%>
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
                        <th>操作</th>
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
                            <td>
                                <button type="button" class="btn btn-primary" data-toggle="modal" id="view" name="organization/create.jsp">
                                    <i class="glyphicon glyphicon-plus" aria-hidden="true"></i>详情
                                </button>
                                <button type="button" class="btn btn-danger" data-toggle="modal" id="update" name="organization/delete.do">
                                    <i class="glyphicon glyphicon-trash" aria-hidden="true"></i>修改
                                </button>
                                <button type="button" class="btn btn-danger" data-toggle="modal" id="delete" name="organization/delete.do">
                                    <i class="glyphicon glyphicon-trash" aria-hidden="true"></i>删除
                                </button>
                            </td>
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
</html>
<script>
    var root1 = '<%=organizationpath%>';


    $(function()
    {
        //搜索完毕,回车触发事件
        $('#search').keydown(function(e){
            if(e.keyCode==13){
               $('#searchForm1').submit();
            }
        });

        // //点击展示页面添加按钮触发事件
        // $('#create').click(function()
        // {
        //     var url = $(this).attr('name');
        //     document.location.href=root+'view/'+url;
        // });
        //
        // //点击展示页面添加按钮触发事件
        // $('#add').click(function()
        // {
        //     var url = $(this).attr('name');
        //     document.location.href=root+url;
        // });
        //
        // //修改选中的节点数据
        // $('#update').click(function()
        // {
        //     if($.selectedCount('update'))
        //     {
        //         var url = root+$(this).attr('name');
        //         $("#searchForm").attr('action', url).submit();
        //     }
        // });
        //
        // //删除选中的节点数据
        // $('#delete').click(function()
        // {
        //     var url = root+$(this).attr('name');
        //     $.isconfirm(url);
        // });
        //
        // //导出数据
        // $('#export').click(function()
        // {
        //     var url = root+$(this).attr('name');
        //     window.open(url);
        // });
        //
        // //点击页面实现全选,反选功能
        // $('#checkall').click(function()
        // {
        //     $('input[name=ids]').prop('checked', $(this).prop('checked'));
        // });
        //
        // //实现全选反选功能
        // $('input[name=ids]').click(function()
        // {
        //     if($('input[name=ids]').length == $('input[name=ids]:checked').length)
        //     {
        //         $('#checkall').prop('checked', true);
        //     }
        //     else
        //     {
        //         $('#checkall').prop('checked', false);
        //     }
        // });

        /**
         * 自定义(删除提示)函数
         * url: 调用删除的路径定制
         * 返回true则直接执行删除
         * false则不是删除当前记录
         */


        /**
         * 自定义(选中条数)函数
         * type: 来判断是 修改还是删除
         * 修改判断只能选中一条记录
         * 删除判断至少选中一条记录
         * 返回true则可以继续执行, false则反之
         */
        // $.extend({'selectedCount':function(type){
        //         var selected = $('input[name=ids]:checked').length;
        //         if(type == 'update')
        //         {
        //             if(selected != 1)
        //             {
        //                 swal({title:"温馨提示",text:"修改信息时,您只能选择一条记录修改?"});
        //                 return false;
        //             }
        //         }
        //         else if(type == 'delete')
        //         {
        //             if(selected == 0)
        //             {
        //                 swal({title:"温馨提示",text:"删除信息时,您至少选择一条记录删除?"});
        //                 return false;
        //             }
        //         }
        //         return true;
        //     }});
    });
    $(function () {
        $(document).ready(function(){
            $("#code").append("(目前有"+$("#code1").val()+"人)");
        });
    })
</script>