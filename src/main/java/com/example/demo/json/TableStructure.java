package com.example.demo.json;

import java.sql.Time;

public class TableStructure {
	public String endpt_id;
	public String bulk_id;
	public String cycl_num;
	public String avail_ts;
	public String stat_cd;
	public String stat_msg_txt;
	public String prty_num;
	public String lst_stat_ts;
	public String xfer_file_sz_num;
	public String tms_xferd_cnt;
	public String xfer_rqst_ts;
	public String xfer_strt_ts;
	public String xfer_stop_ts;
	public String xfer_cond_cd;
	public String xfer_stat_txt;
	public String appl_prcssng_dt;
	public String source_hub_id;
	public String owning_hub_id;
	public String fully_qual_file_nam;
	public String  lst_updt_ts;
	public String  tm_retry_cnt;
	public String trnsfrm_file_size_num;
	public String file_nam;
	public String getEndpt_id() {
		return endpt_id;
	}
	public void setEndpt_id(String endpt_id) {
		this.endpt_id = endpt_id;
	}
	public String getBulk_id() {
		return bulk_id;
	}
	public void setBulk_id(String bulk_id) {
		this.bulk_id = bulk_id;
	}
	public String getCycl_num() {
		return cycl_num;
	}
	public void setCycl_num(String cycl_num) {
		this.cycl_num = cycl_num;
	}
	public String getAvail_ts() {
		return avail_ts;
	}
	public void setAvail_ts(String avail_ts) {
		this.avail_ts = avail_ts;
	}
	public String getStat_cd() {
		return stat_cd;
	}
	public void setStat_cd(String stat_cd) {
		this.stat_cd = stat_cd;
	}
	public String getStat_msg_txt() {
		return stat_msg_txt;
	}
	public void setStat_msg_txt(String stat_msg_txt) {
		this.stat_msg_txt = stat_msg_txt;
	}
	public String getPrty_num() {
		return prty_num;
	}
	public void setPrty_num(String prty_num) {
		this.prty_num = prty_num;
	}
	public String getLst_stat_ts() {
		return lst_stat_ts;
	}
	public void setLst_stat_ts(String lst_stat_ts) {
		this.lst_stat_ts = lst_stat_ts;
	}
	public String getXfer_file_sz_num() {
		return xfer_file_sz_num;
	}
	public void setXfer_file_sz_num(String xfer_file_sz_num) {
		this.xfer_file_sz_num = xfer_file_sz_num;
	}
	public String getTms_xferd_cnt() {
		return tms_xferd_cnt;
	}
	public void setTms_xferd_cnt(String tms_xferd_cnt) {
		this.tms_xferd_cnt = tms_xferd_cnt;
	}
	public String getXfer_rqst_ts() {
		return xfer_rqst_ts;
	}
	public void setXfer_rqst_ts(String xfer_rqst_ts) {
		this.xfer_rqst_ts = xfer_rqst_ts;
	}
	public String getXfer_strt_ts() {
		return xfer_strt_ts;
	}
	public void setXfer_strt_ts(String xfer_strt_ts) {
		this.xfer_strt_ts = xfer_strt_ts;
	}
	public String getXfer_stop_ts() {
		return xfer_stop_ts;
	}
	public void setXfer_stop_ts(String xfer_stop_ts) {
		this.xfer_stop_ts = xfer_stop_ts;
	}
	public String getXfer_cond_cd() {
		return xfer_cond_cd;
	}
	public void setXfer_cond_cd(String xfer_cond_cd) {
		this.xfer_cond_cd = xfer_cond_cd;
	}
	public String getXfer_stat_txt() {
		return xfer_stat_txt;
	}
	public void setXfer_stat_txt(String xfer_stat_txt) {
		this.xfer_stat_txt = xfer_stat_txt;
	}
	public String getAppl_prcssng_dt() {
		return appl_prcssng_dt;
	}
	public void setAppl_prcssng_dt(String appl_prcssng_dt) {
		this.appl_prcssng_dt = appl_prcssng_dt;
	}
	public String getSource_hub_id() {
		return source_hub_id;
	}
	public void setSource_hub_id(String source_hub_id) {
		this.source_hub_id = source_hub_id;
	}
	public String getOwning_hub_id() {
		return owning_hub_id;
	}
	public void setOwning_hub_id(String owning_hub_id) {
		this.owning_hub_id = owning_hub_id;
	}
	public String getFully_qual_file_nam() {
		return fully_qual_file_nam;
	}
	public void setFully_qual_file_nam(String fully_qual_file_nam) {
		this.fully_qual_file_nam = fully_qual_file_nam;
	}
	public String getLst_updt_ts() {
		return lst_updt_ts;
	}
	public void setLst_updt_ts(String lst_updt_ts) {
		this.lst_updt_ts = lst_updt_ts;
	}
	public String getTm_retry_cnt() {
		return tm_retry_cnt;
	}
	public void setTm_retry_cnt(String tm_retry_cnt) {
		this.tm_retry_cnt = tm_retry_cnt;
	}
	public String getTrnsfrm_file_size_num() {
		return trnsfrm_file_size_num;
	}
	public void setTrnsfrm_file_size_num(String trnsfrm_file_size_num) {
		this.trnsfrm_file_size_num = trnsfrm_file_size_num;
	}
	public String getFile_nam() {
		return file_nam;
	}
	public void setFile_nam(String file_nam) {
		this.file_nam = file_nam;
	}
	public TableStructure(String endpt_id, String bulk_id, String cycl_num, String avail_ts, String stat_cd,
			String stat_msg_txt, String prty_num, String lst_stat_ts, String xfer_file_sz_num, String tms_xferd_cnt,
			String xfer_rqst_ts, String xfer_strt_ts, String xfer_stop_ts, String xfer_cond_cd, String xfer_stat_txt,
			String appl_prcssng_dt, String source_hub_id, String owning_hub_id, String fully_qual_file_nam,
			String lst_updt_ts, String tm_retry_cnt, String trnsfrm_file_size_num, String file_nam) {
		
		super();
		this.endpt_id = endpt_id;
		this.bulk_id = bulk_id;
		this.cycl_num = cycl_num;
		this.avail_ts = avail_ts;
		this.stat_cd = stat_cd;
		this.stat_msg_txt = stat_msg_txt;
		this.prty_num = prty_num;
		this.lst_stat_ts = lst_stat_ts;
		this.xfer_file_sz_num = xfer_file_sz_num;
		this.tms_xferd_cnt = tms_xferd_cnt;
		this.xfer_rqst_ts = xfer_rqst_ts;
		this.xfer_strt_ts = xfer_strt_ts;
		this.xfer_stop_ts = xfer_stop_ts;
		this.xfer_cond_cd = xfer_cond_cd;
		this.xfer_stat_txt = xfer_stat_txt;
		this.appl_prcssng_dt = appl_prcssng_dt;
		this.source_hub_id = source_hub_id;
		this.owning_hub_id = owning_hub_id;
		this.fully_qual_file_nam = fully_qual_file_nam;
		this.lst_updt_ts = lst_updt_ts;
		this.tm_retry_cnt = tm_retry_cnt;
		this.trnsfrm_file_size_num = trnsfrm_file_size_num;
		this.file_nam = file_nam;
	}

}
