<%@include file="../includes/header.jsp" %>
<body>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        Kawa Brands
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
                 <h3 class="box-title">Add Brands</h3>
                   </div>
               <!-- /.box-header -->
            <!-- form start -->
             <form:form modelAttribute="brands" action="${SITE_URL}/brandsview/save" method="Post" role="form" id="userForm">
    <div class="form-group">
        <label>Brand Name</label>
        <form:input path="name" placeholder="Enter name" required="required" class="form-control"/>
    </div>
  <form:hidden path="id"/>
    <div class="form-group"> 
    <form:button value="save" class="btn btn-success">Save</form:button>
     <a href="${SITE_URL}/brandsview/list"class="btn btn-danger">Cancel</a>
    </div>


</form:form>
		</div>
      </div>
    </div>
  </section>
 </div>
          

</body>
</html>