package com.adms.mglplanlv.dao.mgltarget.impl;

import org.springframework.stereotype.Repository;

import com.adms.common.dao.generic.impl.GenericDaoHibernate;
import com.adms.mglplanlv.dao.mgltarget.MglTargetDao;
import com.adms.mglplanlv.entity.MglTarget;

@Repository("mglTargetDao")
public class MglTargetDaoImpl extends GenericDaoHibernate<MglTarget, Long> implements MglTargetDao {

	public MglTargetDaoImpl() {
		super(MglTarget.class);
	}
	
}
