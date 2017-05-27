<%@include file="Header.jsp" %>
<div class="row home-content">
    <div class="col-md-12">
        <form action="FrmTambahKaryawan.htm" method="POST" >
            <button class="btn btn-success" type="submit" ><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Tambah</button>
        </form>
        <div class="table-responsive">
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>NIK</th>
                        <th>Nama</th>
                        <th>Alamat</th>
                        <th>Telp</th>
                        <th>Jabatan</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${list}" var="a">
                        <tr>
                            <td>${a.nik}</td>
                            <td>${a.nama}</td>
                            <td>${a.alamat}</td>
                            <td>${a.telp}</td>
                            <td>${a.jabatan}</td>
                            <td><a href="FrmUpdateKaryawan.htm?id=${a.id}"><span class="glyphicon glyphicon-edit" aria-hidden="true"></span> Edit</a></td>
                            <td><a href="ProsesHapusKaryawan.htm?id=${a.id}"><span class="glyphicon glyphicon-remove-circle" aria-hidden="true"></span> Hapus</a></td>
                        </tr>    
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
<jsp:include page="Footer.jsp"/>