package br.com.crudbffhexa.adapter.input.response;

public class PaginacaoResponse {

	private Integer page;
	private Long size;
	private Integer totalPage;
	private Object data;
	
	public PaginacaoResponse() {
	}

	public PaginacaoResponse(Integer page, Long size, Integer totalPage, Object data) {
		this.page = page;
		this.size = size;
		this.totalPage = totalPage;
		this.data = data;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
