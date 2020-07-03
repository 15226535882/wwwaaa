<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
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
        <form action="${path }/organization/createcontract.do" method="post" class="form-horizontal" role="form">
            <fieldset>
                <legend>请填写联系人信息</legend>

                <div class="form-group">
                    <label class="col-sm-2 control-label" for="for 属性规定 label 与哪个表单元素绑定">姓名</label>
                    <div class="col-sm-2">
                        <input class="form-control" type="text" name="name" placeholder="姓名"/>
                    </div>
                    <label class="col-sm-2 control-label" for="for 属性规定 label 与哪个表单元素绑定">性别</label>
                    <div class="col-sm-2">
                        <input class="form-control" type="text"  name="sex" placeholder="邮编"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="for 属性规定 label 与哪个表单元素绑定">职务</label>
                    <div class="col-sm-2">
                        <input class="form-control" type="text" name="duty" placeholder="机构地址"/>
                    </div>
                    <label class="col-sm-2 control-label" for="for 属性规定 label 与哪个表单元素绑定">手机</label>
                    <div class="col-sm-2">
                        <input class="form-control" type="text"  name="mobilePhone" placeholder="网站"/>
                    </div>
                </div>


                <div class="form-group">
                    <label class="col-sm-2 control-label" for="for 属性规定 label 与哪个表单元素绑定">电话</label>
                    <div class="col-sm-2">
                        <input class="form-control" type="text"  name="phone" placeholder="机构级别"/>
                    </div>
                    <label class="col-sm-2 control-label" for="for 属性规定 label 与哪个表单元素绑定">传真</label>
                    <div class="col-sm-2">
                        <input class="form-control" type="text"  name="fax" placeholder="机构级别"/>
                    </div>

                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="for 属性规定 label 与哪个表单元素绑定">邮箱</label>
                    <div class="col-sm-2">
                        <input class="form-control" type="text" name="mail" placeholder="手机"/>
                    </div>
                    <label class="col-sm-2 control-label" for="for 属性规定 label 与哪个表单元素绑定">QQ</label>
                    <div class="col-sm-2">
                        <input class="form-control" type="text"  name="qq" placeholder="行业类别"/>
                    </div>

                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="for 属性规定 label 与哪个表单元素绑定">微信</label>
                    <div class="col-sm-2">
                        <input class="form-control" type="text"  name="wechat" placeholder="电话"/>
                    </div>
                    <label class="col-sm-2 control-label" for="for 属性规定 label 与哪个表单元素绑定">地址</label>
                    <div class="col-sm-2">
                        <input class="form-control" type="text"  name="address" placeholder="重要级别"/>
                    </div>

                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="for 属性规定 label 与哪个表单元素绑定">重要等级</label>
                    <div class="col-sm-2">
                        <input class="form-control" type="text"  name="importantGrade" placeholder="国家"/>
                    </div>
                    <label class="col-sm-2 control-label" for="for 属性规定 label 与哪个表单元素绑定">跟进状态</label>
                    <div class="col-sm-2">
                        <input class="form-control" type="text"  name="followStatus" placeholder="单位等级"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="for 属性规定 label 与哪个表单元素绑定">经办人</label>
                    <div class="col-sm-2">
                        <input class="form-control" type="text"  name="employeeId" placeholder="省份"/>
                    </div>
                    <label class="col-sm-2 control-label" for="for 属性规定 label 与哪个表单元素绑定">是否认可</label>
                    <div class="col-sm-2">
                        <input class="form-control" type="text"  name="ifAccept" placeholder="区域等级"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="for 属性规定 label 与哪个表单元素绑定">认可理由</label>
                    <div class="col-sm-2">
                        <input class="form-control" type="text"  name="acceptReason" placeholder="城市"/>
                    </div>
                    <label class="col-sm-2 control-label" for="for 属性规定 label 与哪个表单元素绑定">信息来源</label>
                    <div class="col-sm-2">
                        <input class="form-control" type="text"  name="origin" placeholder="城市"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="for 属性规定 label 与哪个表单元素绑定">备注</label>
                    <div class="col-sm-2">
                        <input class="form-control" type="text"  name="rank" placeholder="城市"/>
                    </div>
                    <label class="col-sm-2 control-label" for="for 属性规定 label 与哪个表单元素绑定">信息来源</label>
                    <div class="col-sm-2">
                        <input class="form-control" type="text"  name="origin" placeholder="城市"/>
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
    <%--$(function () {--%>
    <%--    var root2 = '<%=createcontract%>';--%>

    <%--    //点击触发事件--%>
    <%--    $('#createcontract').click(function()--%>
    <%--    {--%>
    <%--        document.location.href=root2+"view/organization/contract.jsp";--%>
    <%--    });--%>


    <%--})--%>

</script>