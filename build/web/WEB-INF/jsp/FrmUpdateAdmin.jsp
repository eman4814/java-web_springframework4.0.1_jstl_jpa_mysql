<%@include file="Header.jsp" %>
<div class="row home-content">
    <div class="col-md-10">
        <form action="ProsesUpdateAdmin.htm" method="POST">
            <div class="form-group">
                <label for="exampleInputEmail1">ID</label>
                <input type="text" name="id" value="${a.id}" class="form-control" id="exampleInputEmail1" placeholder="ID">
            </div>
            <div class="form-group">
                <label for="exampleInputEmail1">Username</label>
                <input type="text" name="username" value="${a.username}" class="form-control" id="exampleInputEmail1" placeholder="Username">
            </div>
            <div class="form-group">
                <label for="exampleInputPassword1">Password</label>
                <input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
            </div>
            <div class="form-group">
                <label>Level</label>
                <select class="form-control" name="level" >
                    <option  value="Super.Admin">Super.admin</option>
                    <option  value="Admin">Admin</option>
                    <option  value="Manager">Manager</option>
                </select>
            </div>
            <button type="submit" class="btn btn-default">Submit</button>
        </form>
    </div>
</div>
<jsp:include page="Footer.jsp"/>