<#include "../common/header.ftlh">
<#include "../common/nav.ftlh">

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <form role="form" action="/seller/category/save" method="get">
                <div class="form-group">
                    <label for="categoryName">类目名称</label>
                    <input type="text" class="form-control" name="categoryName" id="categoryName"
                           value="${(productCategory.categoryName)!''}"/>
                </div>
                <div class="form-group">
                    <label for="categoryType">类目类别</label>
                    <input type="number" class="form-control" name="categoryType" id="categoryType"
                           value="${(productCategory.categoryType)!''}"/>
                </div>
                <input hidden type="number" name="categoryId" id="categoryId"
                       value="${(productCategory.categoryId)!''}"/>
                <button type="submit" class="btn btn-default">提交</button>
            </form>
        </div>
    </div>
</div>