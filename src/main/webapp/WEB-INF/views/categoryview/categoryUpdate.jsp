<%@include file="../includes/header.jsp" %>
<body>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        Kawa Categories
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
                 <h3 class="box-title">Edit categories</h3>
                   </div>
               <!-- /.box-header -->
            <!-- form start -->
             <form:form modelAttribute="categories" action="${SITE_URL}/categoryview/save" method="Post" role="form">
    	        <div class="form-group">
        	    <label>category Name</label>
        	      <form:input path="name" placeholder="Enter category" required="required" class="form-control"/>
    		     </div>
              <div class="form-group">
                   <label>Description</label>
                   <form:textarea path="description" placeholder="Decribe category"  rows="5" cols="10" required="required" class="form-control"/>
                     </div>
				     <div class="form-group">
				        <label>Added Date</label>
				        <form:input type="date"  path="addedDate" name="checkinDate"   required="required" class="form-control"/>
				    </div>
					 <div class="form-group">
					        <label>Modified Date</label>
					        <form:input type="date" path="modifiedDate"  name="checkoutDate"   required="required" class="form-control"/>
					    </div>
    						<form:hidden path="id"/>
		    			<div class="form-group"> 
		    		<form:button value="save" class="btn btn-success">Save</form:button>
		     <a href="${SITE_URL}/categoryview/list"class="btn btn-danger">Cancel</a>
		    </div>
		</form:form>
		</div>
      </div>
    </div>
  </section>
 </div>
          

</body>
</html>