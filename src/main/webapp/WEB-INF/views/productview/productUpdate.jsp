<%@include file="../includes/header.jsp" %>
<body>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        Kawa Products
      <small>advanced tables</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li><a href="#">Tables</a></li>
        <li class="active">Data tables</li>
      </ol>
    </section>
<section class="content">
      <div class="row">
        <!-- left column -->
        <div class="col-md-8">
          <!-- general form elements -->
            <div class="box box-primary">
               <div class="box-header with-border">
                 <h3 class="box-title">Add Products</h3>
                   </div>
<form:form modelAttribute="products" action="${SITE_URL}/productview/save" method="Post" enctype="multipart/form-data" role="form">
    <div class="form-group">
        <label>Product Name</label>
        <form:input path="productName" placeholder="Enter category" required="required" class="form-control"/>
    </div>
    
     <div class="form-group">
        <label>Added Date</label>
        <form:input type="date"  path="addedDate"    required="required" class="form-control"/>
    </div>
    <div class="form-group">
        <label>Product Image</label>
        <input type="file" name="file" path="imageURl"  placeholder="Select Product Image" required="required" class="form-control"/>
       
    </div>
    

    <div class="form-group">
        <label>Modified Date</label>
        <form:input type="date" path="modifiedDate"   required="required" class="form-control"/>
    </div>
    
    <div class="form-group">
        <label>Price</label>
        <form:input path="productPrice" placeholder="Price per unit"  required="required" class="form-control"/>
    </div>
    <div class="form-group">
        <label>Quantity</label>
        <form:input path="productQuantity" placeholder="Number of quantity"  required="required" class="form-control"/>
    </div>
    <div class="form-group">
        <label>Select Category</label>
        <form:select path="categories.id"  class="form-control">
        <form:option value="0">Select a category</form:option>
         <c:forEach items="${categories}" var="categories">
         <form:option value="${categories.id }">${categories.name}</form:option>
         </c:forEach>
        </form:select>
    </div>
     <div class="form-group">
        <label>Select Brand</label>
        <form:select path="brands.id"  class="form-control">
        <form:option value="0">Select a Brand</form:option>
         <c:forEach items="${brands}" var="brands">
         <form:option value="${brands.id }">${brands.name}</form:option>
         </c:forEach>
        </form:select>
    </div>
  
    <form:hidden path="productId"/>
    <div class="form-group"> 
    <form:button value="save" class="btn btn-success" >Save</form:button>
     <a href="${SITE_URL}/productview/list"class="btn btn-danger">Cancel</a>
    </div>


</form:form>
</div>
      </div>
    </div>
  </section>
 </div>
</body>
</html>