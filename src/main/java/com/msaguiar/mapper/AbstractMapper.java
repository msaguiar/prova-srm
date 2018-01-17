package com.msaguiar.mapper;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

public abstract class AbstractMapper<D, F> {

	public abstract D mapper(F f);

	public List<D> mapper(List<F> f) {
		return f.stream().filter(Objects::nonNull).map(this::mapper).collect(Collectors.toList());
	}
}
