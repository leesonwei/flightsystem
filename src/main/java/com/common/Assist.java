package com.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Encoding format is UTF-8
 */
public class Assist {
	// ȥ��
	private String distinct;
	// �Զ�������
	private String order;
	// ���ݷ�ҳ��ʼ��
	private Integer startRow;
	// ÿ��ȡ����������
	private Integer rowSize;
	// �����Զ��巵����
	private String resultColumn;
	// ������
	private List<whereRequire> require = null;
	/**
	 * ������,require����Ϊ�е�����,valueΪ����ֵ
	 * @author Mirren
	 */
	public class whereRequire {
		private String require;
		private String value;

		public whereRequire(String require, String value) {
			super();
			this.require = require;
			this.value = value;
		}

		public String getRequire() {
			return require;
		}

		public void setRequire(String require) {
			this.require = require;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

	}
	

	/**
	 * ��Ӳ�ѯ����,����ΪAssist���ڲ���whereRequire,�Ƽ�ʹ��Assist�ľ�̬���������������;
	 * @param require ʾ��:Assist.and_lt("id",10),...
	 */
	public void setRequires(whereRequire... require) {
		if (this.require == null) {
			this.require = new ArrayList<Assist.whereRequire>();
		}
		for (int i = 0; i < require.length; i++) {
			this.require.add(require[i]);
		}
	}

	/**
	 * ����(����)1 = ����(����)2 ;������д�����ͬ����ʹ�ñ���.����,�����������ͬ��������ֱ������
	 * @param column
	 * @param req
	 * @return
	 */
	public static whereRequire and_eq(String column, String req) {
		return new Assist().new whereRequire("and " + column + " = ", req);
	}


	/**
	 * ����(����)1 = ����(����)2 ;������д�����ͬ����ʹ�ñ���.����,�����������ͬ��������ֱ������
	 * @param column
	 * @param req
	 * @return
	 */
	public static whereRequire or_eq(String column, String req) {
		return new Assist().new whereRequire("or " + column + " = ", req);
	}


	/**
	 * ����(����)1 <>(������) ����(����)2 ;������д�����ͬ����ʹ�ñ���.����,�����������ͬ��������ֱ������
	 * @param column
	 * @param req
	 * @return
	 */
	public static whereRequire and_neq(String column, String req) {
		return new Assist().new whereRequire("and " + column + " &lt;&gt; ", req);
	}


	/**
	 * ����(����)1 <>(������) ����(����)2 ;������д�����ͬ����ʹ�ñ���.����,�����������ͬ��������ֱ������
	 * @param column
	 * @param req
	 * @return
	 */
	public static whereRequire or_neq(String column, String req) {
		return new Assist().new whereRequire("or " + column + " &lt;&gt; ", req);
	}

	/**
	 * ����(����)1 < ����(����)2 ;������д�����ͬ����ʹ�ñ���.����,�����������ͬ��������ֱ������
	 * @param column
	 * @param req
	 * @return
	 */
	public static whereRequire and_lt(String column, String req) {
		return new Assist().new whereRequire("and " + column + "&lt; ", req);
	}

	/**
	 * ����(����)1 < ����(����)2 ;������д�����ͬ����ʹ�ñ���.����,�����������ͬ��������ֱ������
	 * @param column
	 * @param req
	 * @return
	 */
	public static whereRequire or_lt(String column, String req) {
		return new Assist().new whereRequire("or " + column + " &lt; ", req);
	}

	/**
	 * ����(����)1 <= ����(����)2 ;������д�����ͬ����ʹ�ñ���.����,�����������ͬ��������ֱ������
	 * @param column
	 * @param req
	 * @return
	 */
	public static whereRequire and_lte(String column, String req) {
		return new Assist().new whereRequire("and " + column + " &lt;= ", req);
	}

	
	/**
	 * ����(����)1 <= ����(����)2 ;������д�����ͬ����ʹ�ñ���.����,�����������ͬ��������ֱ������
	 * @param column
	 * @param req
	 * @return
	 */
	public static whereRequire or_lte(String column, String req) {
		return new Assist().new whereRequire("or " + column + " &lt;= ", req);
	}


	/**
	 * ����(����)1 > ����(����)2 ;������д�����ͬ����ʹ�ñ���.����,�����������ͬ��������ֱ������
	 * @param column
	 * @param req
	 * @return
	 */
	public static whereRequire and_gt(String column, String req) {
		return new Assist().new whereRequire("and " + column + " &gt; ", req);
	}

	/**
	 * ����(����)1 > ����(����)2 ;������д�����ͬ����ʹ�ñ���.����,�����������ͬ��������ֱ������
	 * @param column
	 * @param req
	 * @return
	 */
	public static whereRequire or_gt(String column, String req) {
		return new Assist().new whereRequire("or " + column + " &gt; ", req);
	}


	/**
	 * ����(����)1 >= ����(����)2 ;������д�����ͬ����ʹ�ñ���.����,�����������ͬ��������ֱ������
	 * @param column
	 * @param req
	 * @return
	 */
	public static whereRequire and_gte(String column, String req) {
		return new Assist().new whereRequire("and " + column + " &gt;= ", req);
	}


	/**
	 * ����(����)1 >= ����(����)2 ;������д�����ͬ����ʹ�ñ���.����,�����������ͬ��������ֱ������
	 * @param column
	 * @param req
	 * @return
	 */
	public static whereRequire or_gte(String column, String req) {
		return new Assist().new whereRequire("or " + column + " &gt;= ", req);
	}

	/**
	 * ����(����)1 like '����(����)2' ;������д�����ͬ����ʹ�ñ���.����,�����������ͬ��������ֱ������
	 * @param column
	 * @param req
	 * @return
	 */
	public static whereRequire and_like(String column, String req) {
		return new Assist().new whereRequire("and " + column + " like ", req);
	}

	/**
	 * ����(����)1 like '����(����)2' ;������д�����ͬ����,ʹ�ñ���.����,�����������ͬ��������ֱ������
	 * @param column
	 * @param req
	 * @return
	 */
	public static whereRequire or_like(String column, String req) {
		return new Assist().new whereRequire("or " + column + " like ", req);
	}

	/**
	 * ��(����)����1 �� ����2����(true=ASC/false=DESC)
	 * ;������д�����ͬ����,����ΪXML�����ļ��е�����:һ��Ϊ:����.����/ʵ������+����
	 * 
	 * @param column
	 * @param mode
	 */
	public void setOrder(String column, boolean mode) {
		if (mode) {
			this.order = "order By " + column + " asc";
		} else {
			this.order = "order By " + column + " desc";
		}
	}
	
	/**
	 * ����Ƿ�ȥ��
	 * @return
	 */
	public String getDistinct() {
		return distinct;
	}
	
	/**
	 * �����Ƿ�ȥ��
	 * @param distinct
	 */
	public void setDistinct(boolean distinct) {
		if (distinct) {
			this.distinct = "distinct";
		}
	}
	/**
	 * �������
	 * @return
	 */
	public String getOrder() {
		return order;
	}
	
	/**
	 * ��ÿ�ʼ��ҳ��
	 * @return
	 */
	public Integer getStartRow() {
		return startRow;
	}

	/**
	 * ���ôӵڼ��п�ʼȡ����
	 * 
	 * @param startRow
	 */
	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}
	
	/**
	 * ���ÿ��ȡ����������
	 * @return
	 */
	public Integer getRowSize() {
		return rowSize;
	}

	/**
	 * ����ÿ��ȡ���ٺ�����
	 * 
	 * @param rowSize
	 */
	public void setRowSize(Integer rowSize) {
		this.rowSize = rowSize;
	}
	
	/**
	 * ��÷���ָ����
	 * @return
	 */
	public String getResultColumn() {
		return resultColumn;
	}
	
	/**
	 * ���÷���ָ���ж������,���Ÿ���;��Ҫ�ر�ע����Ƿ�������Ҫ�����,������mapper�����resultMap��columnΪ׼;һ���������������Ե�˳���,
	 * @return
	 */
	public void setResultColumn(String resultColumn) {
		this.resultColumn = resultColumn;
	}
	/**
	 * ���������
	 * @return
	 */
	public List<whereRequire> getRequire() {
		return require;
	}

	public Assist() {
		super();
	}

	/**
	 * �ù��췽������ʹ��Assist�ľ�̬��������,��̬�������
	 * 
	 * @param require
	 *            ʾ��:Assist.lt("A.ID",10)...
	 */
	public Assist(whereRequire... require) {
		super();
		if (this.require == null) {
			this.require = new ArrayList<Assist.whereRequire>();
		}
		for (int i = 0; i < require.length; i++) {
			this.require.add(require[i]);
		}
	}


}


