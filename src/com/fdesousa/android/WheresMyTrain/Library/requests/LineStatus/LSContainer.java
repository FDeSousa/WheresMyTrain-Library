package com.fdesousa.android.WheresMyTrain.Library.requests.LineStatus;

/******************************************************************************
 * Copyright 2011 Filipe De Sousa
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *****************************************************************************/

import java.util.ArrayList;

/**
 * <b>LSContainer</b>
 * <p>Container of Line Status.<br/>
 * Used when parsing JSON with GSON.</p>
 * @author Filipe De Sousa
 * @version 0.7
 */
public class LSContainer {
	public String requesttype;
	public ArrayList<LSLine> lines = new ArrayList<LSLine>();
	
	/**
	 * Very simple, slow, arraylist search. Loops through each line to find
	 * the line with the matching linename
	 * @param linename - the name of the line to search for
	 * @return instance of matching line, or null if not found
	 */
	public LSLine searchByLinename(String linename) {
		//	If there's nothing to search through, exit early
		if (lines == null || lines.isEmpty()) return null;
		//	Search with foreach for the right line
		for (LSLine line : lines) {
			if (line.linename.equals(linename)) return line;
		}
		//	If nothing has been found, return null
		return null;
	}
}
