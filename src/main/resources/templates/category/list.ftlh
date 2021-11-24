<#include "../common/header.ftlh">
<#include "../common/nav.ftlh">

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table">
                <thead>
                <tr>
                    <th>
                        编号
                    </th>
                    <th>
                        名字
                    </th>
                    <th>
                        创建时间
                    </th>
                    <th>
                        修改时间
                    </th>
                    <th>
                        操作
                    </th>
                </tr>
                </thead>
                <tbody>
                <#list categoryList as category>
                    <tr class="success">
                        <td>
                            ${category.categoryId}
                        </td>
                        <td>
                            ${category.categoryName}
                        </td>
                        <td>
                            ${category.categoryType}
                        </td>
                        <td>
                            ${category.createTime}
                        </td>
                        <td>
                            ${category.updateTime}
                        </td>
                        <td>
                            <a href="/seller/category/index?categoryId=${category.categoryId}">修改</a>
                        </td>
                    </tr>
                </#list>
                </tbody>
            </table>
        </div>
    </div>
</div>