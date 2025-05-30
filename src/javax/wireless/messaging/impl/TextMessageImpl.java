/*
 * Copyright 2018 Nikita Shakarun
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package javax.wireless.messaging.impl;

import javax.wireless.messaging.TextMessage;

public class TextMessageImpl extends MessageImpl implements TextMessage {

	private String data;

	public TextMessageImpl(String address, long timestamp) {
		super(address, timestamp);
	}

	@Override
	public String getPayloadText() {
		return data;
	}

	@Override
	public void setPayloadText(String text) {
		this.data = text;
	}
}
