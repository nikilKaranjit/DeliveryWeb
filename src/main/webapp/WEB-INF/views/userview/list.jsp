<%@include file="../includes/header.jsp" %>
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        Users
      <small>advanced tables</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li><a href="#">Tables</a></li>
        <li class="active">Data tables</li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content">
      <div class="row">
        <div class="col-xs-12">
          <div class="box">
            <div class="box-header">
              <h3 class="box-title">Kawa categories</h3>
            <div class="pull-right">
                <p>
                <a href="${SITE_URL}/userview/form" class="btn btn-primary" data-toggle="modal" title="Add user"/>
                <span class="glyphicon glyphicon-plus">Add</span>
                </a>
                </p>
        </div>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
              <table id="example2" class="table table-bordered table-hover">
                <thead>
                <tr>
                  <th>Id</th>
            	  <th>First Name</th>
           		  <th>Last Name</th>
            	  <th>Username</th>
            		<th>Password</th>
            		 <th>Action</th>
                </tr>
                </thead>
                <tbody>
                 <c:forEach var="users" items="${User}">
                <tr>
                <td>${users.userId}</td>
                <td>${users.firstName}</td>
                <td>${users.lastName}</td>
                <td>${users.userName}</td>
                <td>${users.password}</td>
                
                 <td>
                    <a href="${SITE_URL}/userview/updateform/${users.userId}" class="btn btn-success" title="Edit">
                        <span class="glyphicon glyphicon-pencil">Edit</span>
                    </a>
                    <a href="${SITE_URL}/userview/deleteuser/${users.userId}" class="btn btn-danger" title="Delete" onclick=" return confirm('Are you sure to Delete')">
                        <span class="glyphicon glyphicon-trash">Delete</span>
                    </a>
                </td>
                </tr>
            </c:forEach>
                </tbody>
              </table>
           </div>
            <!-- /.box-body -->
       </div>
          <!-- /.box -->
    </div>
            <!-- /.box-body -->
</div>
          <!-- /.box -->
</section>
        </div>
        
     
     
  
  <!-- /.content-wrapper -->