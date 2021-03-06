/*
 * Copyright 2012 the original author or authors.
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
package org.springframework.social.facebook.web;

public class DeauthorizationRequest {
	
	public String algorithm;
	
	public long issuedAt;
	
	public String userId;
	
	public UserData user;

	public String getAlgorithm() {
		return algorithm;
	}
	
	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}
	
	public long getIssuedAt() {
		return issuedAt;
	}
	
	public void setIssuedAt(long issuedAt) {
		this.issuedAt = issuedAt;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public void setUser(UserData user) {
		this.user = user;
	}
	
	public UserData getUser() {
		return user;
	}
	
	public static class UserData {
		private String country;
		
		private String locale;
		
		public String getCountry() {
			return country;
		}
		
		public void setCountry(String country) {
			this.country = country;
		}
		
		public String getLocale() {
			return locale;
		}
		
		public void setLocale(String locale) {
			this.locale = locale;
		}
	}

}