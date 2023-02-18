package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        if(oldPassword.equals(password)){
            if(newPassword.length()>=8){
                int n=newPassword.length();
                int f=0;
                for(int i=0;i<n;i++){
                    if(newPassword.charAt(i)>=65&&newPassword.charAt(i)<=90){

                        f++;
                        break;}
                    if(f==0)
                        return;
                }
                f=0;
                for(int i=0;i<n;i++){
                    if(newPassword.charAt(i)>=97 && newPassword.charAt(i)<=122){
                        f++;
                        break;
                    }
                }
                if(f==0)
                    return;
                f=0;
                for(int i=0;i<n;i++){
                    if(newPassword.charAt(i)>=48 && newPassword.charAt(i)<=57){
                        f++;
                        break;
                    }
                }
                if(f==0)
                    return;
                f=0;
                for(int i=0;i<n;i++){
                    if(newPassword.charAt(i)>=33&&newPassword.charAt(i)<=47){
                        f++;
                        break;
                    }
                }
                if(f==0)
                    return;

                password=newPassword;

            }
        }
    }
}
