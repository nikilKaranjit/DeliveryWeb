<%@include file="../includes/header.jsp" %> 
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        Categories
      <small>advanced tables</small>
     
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
                <a href="${SITE_URL}/categoryview/form" class="btn btn-primary" title="Add category"/>
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
                  <th>Order Id</th>
                  <th>Ordered By</th>
                  <th>Ordered Date</th>
                  <th>TotalPrice</th>
                  <th>ProductName</th>
                  <th>quantity</th>
                   <th>Action</th>
                </tr>
                </thead>
                <tbody>
                  <c:forEach var="customerorder" items="${CustomerOrder}">
                <tr>
                <td>${customerorder.customerorderId}</td>
                <td>${customerorder.getCustomers().getUsername()}</td>
                <td>${customerorder.orderDate.}</td>
                <td>${customerorder.orderTotalPrice}</td>
                <td>${customerorder.getProducts().getProductName()}</td>
                <td>${customerorder.getProducts().getProductQuantity()}</td>
                <%-- 
                <td>
                    <a href="${SITE_URL}/categoryview/updateform/${cat.id}" class="btn btn-success" title="Edit">
                        <span class="glyphicon glyphicon-pencil">Edit</span>
                    </a>
                    <a href="${SITE_URL}/categoryview/deletecategory/${cat.id}" class="btn btn-danger" title="Delete" onclick=" return confirm('Are you sure to Delete')">
                        <span class="glyphicon glyphicon-trash">Delete</span>
                    </a>
                </td> --%>
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