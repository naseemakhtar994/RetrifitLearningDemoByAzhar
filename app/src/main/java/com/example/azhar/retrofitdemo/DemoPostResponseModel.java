package com.example.brsoft.retrofitdemo;

/**
 * Created by brsoft on 6/1/17.
 */

public class DemoPostResponseModel {
    /**
     * code : 0
     * error : false
     * message : User SubmitProfileDetailsFragment
     * data : {"userid":"37","firstname":"pankaj ","email":"pankaj@gmail.com","phone":null,"status":"A","loginfrom":"N","dob":null,"gender":"M","image":""}
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
         * userid : 37
         * firstname : pankaj
         * email : pankaj@gmail.com
         * phone : null
         * status : A
         * loginfrom : N
         * dob : null
         * gender : M
         * image :
         */

        private String password;
        private String userid;
        private String firstname;
        private String email;
        private Object phone;
        private String status;
        private String loginfrom;
        private Object dob;
        private String gender;
        private String image;

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getUserid() {
            return userid;
        }

        public void setUserid(String userid) {
            this.userid = userid;
        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Object getPhone() {
            return phone;
        }

        public void setPhone(Object phone) {
            this.phone = phone;
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

        public Object getDob() {
            return dob;
        }

        public void setDob(Object dob) {
            this.dob = dob;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }
    }
}
