<%@include file="Header.jsp" %>
<!--Content Presensi -->
<div class="row home-content">
    <div class="col-md-4 text-center"></div>
    <div class="col-md-4 text-center"><h3><strong>Presensi Today</strong></h3></div>
    <div class="col-md-4 text-center"></div>
</div>
<div class="row">
    <div class="container">
        <div class="col-md-4 text-center"></div>
        <div class="col-md-4 text-center">
            <form action="ProsesTambahPresensi.htm" method="POST">
                <input type="text" class="form-control"  name="nik" placeholder="NIK" required autofocus>
                <input type="submit" class="btn btn-success btn-custom" value="ENTER">
            </form>
        </div>
        <div class="col-md-4 text-center"></div>
    </div>
</div>
<div class="row ">
    <div class="col-md-12">
        <table class="table table-hover">
            <tr>
                <th>Hari & Tanggal</th>
                <th>Nama</th>
                <th>Jam Masuk</th>
                <th>Jam Pulang</th>
            </tr>
            <c:forEach items="${listPresensiToday}" var="p">
                <tr>
                    <td><fmt:formatDate pattern="dd-MM-yyyy" value="${p.tgl}" /></td>
                    <td>${p.idKaryawan.nama}</td>
                    <td><fmt:formatDate type="time" value="${p.jamMasuk}" /></td>
                    <td><fmt:formatDate type="time" value="${p.jamKaluar}" /></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
<!--end Content Presensi -->
<jsp:include page="Footer.jsp"/>