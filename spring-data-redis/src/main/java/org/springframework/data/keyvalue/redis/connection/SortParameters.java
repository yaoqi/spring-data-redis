/*
 * Copyright 2010 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.keyvalue.redis.connection;

/**
 * Parameters for the SORT operation.
 * 
 * @author Costin Leau
 */
public interface SortParameters {

	public enum Order {
		ASC, DESC
	}

	/**
	 * Utility class wrapping the 'LIMIT' setting.
	 * 
	 * @author Costin Leau
	 */
	static class Range {
		private final long start;
		private final long count;

		public Range(long start, long count) {
			this.start = start;
			this.count = count;
		}

		long start() {
			return start;
		}

		long count() {
			return count;
		}
	}
	Order getOrder();

	Boolean isAlphabetic();

	byte[] getByPattern();

	byte[] getGetPattern();

	byte[] getHashKey();

	byte[] getStoreKey();

	Range getLimit();
}