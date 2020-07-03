<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%
    String createcontract = request.getContextPath()+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <title>机构添加页面</title>
    <%@ include file="../../common/jsp/header.jsp"%>
    <link href="${path }/static/css/plugins/file-input/fileinput.min.css" rel="stylesheet">
</head>
<body>
<div class="wrapper wrapper-content animated fadeInRight">
    <div>
        <div class="col-sm-4"><input type="button" value="返回上一页" class="btn btn-success" onclick="javascript:history.back();"/></div>
    </div>
    <div class="ibox float-e-margins">
        <form action="${path }/organization/save.do" method="post" class="form-horizontal" role="form">
            <fieldset>
                <legend>请填写机构信息</legend>

                <div class="form-group">
                    <label class="col-sm-2 control-label" for="for 属性规定 label 与哪个表单元素绑定">机构名称</label>
                    <div class="col-sm-2">
                        <input class="form-control" type="text" name="organizationName" placeholder="性别"/>
                    </div>
                    <label class="col-sm-2 control-label" for="for 属性规定 label 与哪个表单元素绑定">邮编</label>
                    <div class="col-sm-2">
                        <input class="form-control" type="text"  name="zipCode" placeholder="邮编"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="for 属性规定 label 与哪个表单元素绑定">机构地址</label>
                    <div class="col-sm-2">
                        <input class="form-control" type="text" name="organizationAddress" placeholder="机构地址"/>
                    </div>
                    <label class="col-sm-2 control-label" for="for 属性规定 label 与哪个表单元素绑定">网站</label>
                    <div class="col-sm-2">
                        <input class="form-control" type="text"  name="website" placeholder="网站"/>
                    </div>
                </div>


                <div class="form-group">
                    <label class="col-sm-2 control-label" for="for 属性规定 label 与哪个表单元素绑定">联系人</label>
                    <div class="col-sm-2">
                        <input class="form-control" id="createcontract"  name="organizationEntity.liuContractEntities[0].name" value="${organizationEntity.liuContractEntities[0].name}" placeholder="创建联系人"/>
                    </div>
                    <label class="col-sm-2 control-label" for="for 属性规定 label 与哪个表单元素绑定">机构级别</label>
                    <div class="col-sm-2">
                        <input class="form-control" type="text"  name="organizationLevel" placeholder="机构级别"/>
                    </div>

                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="for 属性规定 label 与哪个表单元素绑定">手机</label>
                    <div class="col-sm-2">
                        <input class="form-control" type="text" name="organizationEntity.liuContractEntities[0].mobilePhone" value="${organizationEntity.liuContractEntities[0].mobilePhone}" placeholder="手机"/>
                    </div>
                    <label class="col-sm-2 control-label" for="for 属性规定 label 与哪个表单元素绑定">行业类别</label>
                    <div class="col-sm-2">
                        <input class="form-control" type="text"  name="industryCategory" placeholder="行业类别"/>
                    </div>

                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="for 属性规定 label 与哪个表单元素绑定">电话</label>
                    <div class="col-sm-2">
                        <input class="form-control" type="text"  name="telephone" placeholder="电话"/>
                    </div>
                    <label class="col-sm-2 control-label" for="for 属性规定 label 与哪个表单元素绑定">重要级别</label>
                    <div class="col-sm-2">
                        <input class="form-control" type="text"  name="importanceLevel" placeholder="重要级别"/>
                    </div>

                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="for 属性规定 label 与哪个表单元素绑定">国家</label>
                    <div class="col-sm-2">
                        <input class="form-control" type="text"  name="country" placeholder="国家"/>
                    </div>
                    <label class="col-sm-2 control-label" for="for 属性规定 label 与哪个表单元素绑定">单位等级</label>
                    <div class="col-sm-2">
                        <input class="form-control" type="text"  name="companyLevel" placeholder="单位等级"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="for 属性规定 label 与哪个表单元素绑定">省份</label>
                    <div class="col-sm-2">
                        <input class="form-control" type="text"  name="province" placeholder="省份"/>
                    </div>
                    <label class="col-sm-2 control-label" for="for 属性规定 label 与哪个表单元素绑定">区域等级</label>
                    <div class="col-sm-2">
                        <input class="form-control" type="text"  name="areaLevel" placeholder="区域等级"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="for 属性规定 label 与哪个表单元素绑定">城市</label>
                    <div class="col-sm-2">
                        <input class="form-control" type="text"  name="ahId" placeholder="城市"/>
                    </div>
                </div>

            </fieldset>
            <fieldset>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="for 属性规定 label 与哪个表单元素绑定"></label>
                    <div class="col-sm-4">
                        <input type="submit" value="提交" class="btn btn-primary"/>
                    </div>
                    <label class="col-sm-2 control-label" for="for 属性规定 label 与哪个表单元素绑定"></label>
                    <div class="col-sm-4">
                        <input type="reset" value="重置" class="btn btn-danger" id="resetForm"/>
                    </div>
                </div>
            </fieldset>
        </form>
    </div>
</div>
</body>
<script type="text/javascript" src="${path }/static/js/plugins/file-input/fileinput.min.js"></script>
<script type="text/javascript" src="./js/dictionary.js"></script>
</html>
<script>
    $(function () {
        var root2 = '<%=createcontract%>';

        //点击触发事件
        $('#createcontract').click(function()
        {

            document.location.href=root2+"view/organization/contract.jsp";

        });


    })

</script>