<%@include file="../includes/header.jsp" %>
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        Products
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
                <a href="${SITE_URL}/productview/form" class="btn btn-primary" title="Add category"/>
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
                  <th>Product Id</th>
                  <th>Product Name</th>
                  <th>Added Date</th>
                  <th>Modified Date</th>
                  <th>Image Name</th>
                   <th>Product Price</th>
                   <th>Product Quantity</th>
                  <th>Action</th>
                </tr>
                </thead>
                <tbody>
                 <c:forEach var="products" items="${Products}">
                <tr>
                <td>${products.productId}</td>
                <td>${products.productName}</td>
                <td>${products.addedDate}</td>
                <td>${products.modifiedDate}</td>
                <td>${products.imageURl}</td>
                <td>${products.productPrice}</td>
                <td>${products.productQuantity}</td>
                
                <td>
                    <a href="${SITE_URL}/productview/updateform/${products.productId}" class="btn btn-success" title="Edit">
                        <span class="glyphicon glyphicon-pencil"></span>
                    </a>
                    <a href="${SITE_URL}/productview/deleteproduct/${products.productId}" class="btn btn-danger" title="Delete" onclick=" return confirm('Are you sure to Delete')">
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