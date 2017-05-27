<%@include file="Header.jsp" %>
<div class="row home-content">
    <div class="col-md-10">
        <form action="ProsesTambahKaryawan.htm" method="POST">
            <div class="form-group">
                <label for="exampleInputEmail1">NIK</label>
                <input type="text" name="nik" class="form-control" id="exampleInputEmail1" placeholder="NIK">
            </div>
            <div class="form-group">
                <label for="exampleInputEmail1">NAMA</label>
                <input type="text" name="nama" class="form-control" id="exampleInputEmail1" placeholder="Nama">
            </div>
            <div class="form-group">
                <label for="exampleInputEmail1">ALAMAT</label>
                <input type="text" name="alamat" class="form-control" id="exampleInputEmail1" placeholder="Alamat">
            </div>
            <div class="form-group">
                <label for="exampleInputEmail1">TELP</label>
                <input type="text" name="telp" class="form-control" id="exampleInputEmail1" placeholder="Telp">
            </div>
            
            <div class="form-group">
                <label>Level</label>
                <select class="form-control" name="jabatan">
                    <option value="Karyawan">Karyawan</option>
                    <option value="HRD">HRD</option>
                    <option value="OWNER">OWNER</option>
                </select>
            </div>
            <button type="submit" class="btn btn-default">Submit</button>
        </form>
    </div>
</div>
<jsp:include page="Footer.jsp"/>