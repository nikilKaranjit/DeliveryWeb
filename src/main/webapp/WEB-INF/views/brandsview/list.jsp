<%@include file="../includes/header.jsp" %>

<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        Brands
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
              <h3 class="box-title">Kawa brands</h3>
            <div class="pull-right">
                <p>
                <a href="${SITE_URL}/brandsview/form" class="btn btn-primary" title="Add category"/>
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
                  <th>Brand Id</th>
                  <th>Brand Name</th>
                  <th>Action</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="brands" items="${brands}">
                <tr>
                <td>${brands.id}</td>
                <td>${brands.name}</td>
              	<td>
                    <a href="${SITE_URL}/brandsview/updateform/${brands.id}" class="btn btn-success" title="Edit">
                        <span class="glyphicon glyphicon-pencil">Edit</span>
                    </a>
                    <a href="${SITE_URL}/brandsview/deletebrand/${brands.id}" class="btn btn-danger" title="Delete" onclick=" return confirm('Are you sure to Delete')">
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