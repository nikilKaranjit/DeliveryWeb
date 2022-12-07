<%@include file="../includes/header.jsp" %>
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        Store
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
                <a href="${SITE_URL}/storeview/form" class="btn btn-primary" title="Add category"/>
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
                  <th>Store Id</th>
                  <th>Store Name</th>
                  <th>Store Number</th>
                  
                  <th>Action</th>
                </tr>
                </thead>
                <tbody>
                 <c:forEach var="store" items="${Store}">
                <tr>
                <td>${store.storeId}</td>
                <td>${store.storeName}</td>
                <td>${store.storeNumber}</td>
                
                
                <td>
                    <a href="${SITE_URL}/storeview/updateform/${store.storeId}" class="btn btn-success" title="Edit">
                        <span class="glyphicon glyphicon-pencil"></span>
                    </a>
                    <a href="${SITE_URL}/storeview/deletestore/${store.storeId}" class="btn btn-danger" title="Delete" onclick=" return confirm('Are you sure to Delete')">
                        <span class="glyphicon glyphicon-trash"></span>
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