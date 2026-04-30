package com.jugueteria.backend.common.base;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
public interface BaseMapper<E, D> {
    
  public D toModel(E e);

	public E toEntity(D d);

	@SuppressWarnings("null")
	public default Page<D> toModel(Page<E> p) {
		List<D> models = p.getContent().stream()
				.map(e -> toModel(e))
				.collect(Collectors.toList());
		return new PageImpl<>(models, p.getPageable(), p.getTotalElements());
	}

	@SuppressWarnings("null")
	public default Page<E> toEntity(Page<D> p) {
		List<E> entities = p.getContent().stream()
				.map(e -> toEntity(e))
				.collect(Collectors.toList());
		return new PageImpl<>(entities, p.getPageable(), p.getTotalElements());
	}

	public List<D> toModelList(List<E> e);

	public List<E> toEntityList(List<D> d);
}