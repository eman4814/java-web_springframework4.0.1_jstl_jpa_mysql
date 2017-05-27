<%@include file="Header.jsp" %>
    <div class="row home-content">
        <div class="col-md-12">
            <div class="table-responsive">
                <form action="FrmTambahAdmin.htm" method="POST" >
                    <button class="btn btn-success" type="submit" ><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Tambah</button>
                </form>
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Username</th>
                            <th>Level</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${list}" var="a">
                            <tr>
                                <td>${a.id}</td>
                                <td>${a.username}</td>
                                <td>${a.level}</td>
                                <td><a href="FrmUpdateAdmin.htm?id=${a.id}"><span class="glyphicon glyphicon-edit" aria-hidden="true"></span> Edit</a></td>
                                <td><a href="ProsesHapusAdmin.htm?id=${a.id}"><span class="glyphicon glyphicon-remove-circle" aria-hidden="true"></span> Hapus</a></td>
                            </tr>    
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
<jsp:include page="Footer.jsp"/>