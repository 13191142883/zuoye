package com.xtgj.j2ee.chapter04.basedao;

import com.xtgj.j2ee.chapter04.entity.FWXX;

import java.util.List;

public interface FwxxDAO {
    void add(FWXX item);

    void del(int fwid);

    void update(FWXX item);

    List search(FWXX condition);

}
