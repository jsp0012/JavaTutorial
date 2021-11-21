    package com.company;

    //islemler aynıdır sadece tip degisir, müsteri icin, kullanıcı icin yazılımcı icin vs
    //bunun icin <T> tipinde interface olmalı

    public interface IEntitiyRepository <T extends IEntitiy > {

         void add(T entitiy);
         void delete(T entitiy);
         void update(T entitiy);



    }
