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
                   <form:form modelAttribute="user" action="${SITE_URL}/userview/save" method="Post" role="form" id="userForm">
    <div class="form-group">
        <label>First Name</label>
        <form:input path="firstName" placeholder="Enter name" required="required" class="form-control"/>
    </div>
    <div class="form-group">
        <label>Last Name</label>
        <form:input path="lastName"  required="required" class="form-control"/>
    </div>
    
    
    
    <div class="form-group">
        <label>Username</label>
        <form:input path ="userName" placeholder="Enter Username" required="required" class="form-control"/>
    </div>
    
      <div class="form-group">
        <label>Password</label>
        <form:input path ="password" type="password" required="required" class="form-control"/>
    </div>
 
     <div class="form-group">
        <label>Role</label>
        <form:select path="role.roleId"  class="form-control">
         <c:forEach items="${roles}" var="role">
         <form:option value="${role.roleId }">${role.roleType}</form:option>
         </c:forEach>
        </form:select>
    </div>
  
    <form:hidden path="userId"/>
    <div class="form-group"> 
    <form:button value="save" class="btn btn-success">Save</form:button>
     <a href="${SITE_URL}/userview/list"class="btn btn-danger">Cancel</a>
    </div>


</form:form>
</div>
      </div>
    </div>
  </section>
 </div>
</body>
</html>