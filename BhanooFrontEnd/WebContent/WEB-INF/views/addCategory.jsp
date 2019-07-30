<%-- <div class="row">

	<div class="col-lg-12">

		


		<form:form class="form-horizontal" modelAttribute="category" action="${cp}/addCat" method="post">
			<fieldset>

				<!-- Form Name -->
				<legend>Add Category</legend>

				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="name">Category
						Name</label>
					<div class="col-md-5">
						<form:input path="name" name="name" 
							placeholder="Category Name" class="form-control input-md"
							required=""/> <span class="help-block">Enter
							Category Name</span>
					</div>
				</div>

				<!-- Textarea -->
				<div class="form-group">
					<label class="col-md-4 control-label" for="description">Description</label>
					<div class="col-md-4">
						<form:textarea class="form-control" path="description" name="description"></form:textarea>
					</div>
				</div>

				<!-- Button (Double) -->
				<div class="form-group">
					<label class="col-md-4 control-label" for="submit"></label>
					<div class="col-md-8">
						<button id="submit" type="submit" name="submit" class="btn btn-success">Submit</button>
						<button id="cancle" type="reset" name="cancle" class="btn btn-danger">Reset</button>
					</div>
				</div>

			</fieldset>
		</form:form>
		
		
		<table border="2px">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Active</th>
			<th>Description</th>
			
		</tr>
		
		<c:forEach items="${categories}" var="category">
        		<tr>
			<td>${category.id}</td>
			<td>${category.name}</td>
			<td>${category.active}</td>
			<td>${category.description}</td>
		</tr>
            </c:forEach>
		</table>
	</div>
	<!-- /.col-lg-12-->

</div>
<!-- /.row --> --%>