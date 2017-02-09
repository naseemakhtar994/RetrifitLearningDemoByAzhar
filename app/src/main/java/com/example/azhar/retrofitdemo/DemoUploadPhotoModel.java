package com.example.brsoft.retrofitdemo;

/**
 * Created by brsoft on 6/1/17.
 */

public class DemoUploadPhotoModel {
    /**
     * code : 0
     * error : false
     * message : User SubmitProfileDetailsFragment successfully updated, User Data
     * data : {"id":"41","firstname":"suresh","lastname":null,"phone":"56465165","email":"vishnu@gmail.com","status":"A","loginfrom":"N","dob":"1988-02-20","gender":"M"}
     */

    private int code;
    private boolean error;
    private String message;
    private Data data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public static class Data {
        /**
         * id : 41
         * firstname : suresh
         * lastname : null
         * phone : 56465165
         * email : vishnu@gmail.com
         * status : A
         * loginfrom : N
         * dob : 1988-02-20
         * gender : M
         */

        private String id;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        private String image;
        private String firstname;
        private Object lastname;
        private String phone;
        private String email;
        private String status;
        private String loginfrom;
        private String dob;
        private String gender;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public Object getLastname() {
            return lastname;
        }

        public void setLastname(Object lastname) {
            this.lastname = lastname;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getLoginfrom() {
            return loginfrom;
        }

        public void setLoginfrom(String loginfrom) {
            this.loginfrom = loginfrom;
        }

        public String getDob() {
            return dob;
        }

        public void setDob(String dob) {
            this.dob = dob;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }
    }
}
