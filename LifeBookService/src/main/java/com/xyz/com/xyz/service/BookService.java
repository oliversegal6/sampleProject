package com.xyz.com.xyz.service;

import com.xyz.Pojo.Node;

import java.util.List;

public interface BookService {

    public List<Node> getBookTree(String userId);
}
