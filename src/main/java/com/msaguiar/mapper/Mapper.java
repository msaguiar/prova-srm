package com.msaguiar.mapper;

import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;

public interface Mapper<D, F> {

	public abstract D mapper(F f);

	public default Collection<D> mapper(Collection<F> f) {
		return f.stream().filter(Objects::nonNull).map(this::mapper).collect(Collectors.toList());
	}
}
