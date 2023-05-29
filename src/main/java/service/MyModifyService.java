package service;


import model.Response;

public interface MyModifyService {
     Response modify(Response response);

    static void modifyRq(Response response) {
    }
}
