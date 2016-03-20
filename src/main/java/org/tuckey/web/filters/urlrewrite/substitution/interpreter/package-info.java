/**
 * Copyright (c) 2005-2007, Paul Tuckey
 * All rights reserved.
 * ====================================================================
 * Licensed under the BSD License. Text as follows.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *   - Redistributions in binary form must reproduce the above
 *     copyright notice, this list of conditions and the following
 *     disclaimer in the documentation and/or other materials provided
 *     with the distribution.
 *   - Neither the name tuckey.org nor the names of its contributors
 *     may be used to endorse or promote products derived from this
 *     software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
 * COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
 * ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 * ====================================================================
 */

/**
 * This package processes function in &quot;to&quot; value with 
 * <a href="http://en.wikipedia.org/wiki/Interpreter_pattern" >Interpreter pattern</a> .
 * BNF for Interpreter pattern is below.
 * <ul>
 * <li>&lt;tovalue&gt; ::= &lt;element&gt; *</li>
 * <li>&lt;element&gt; ::= &lt;value&gt; | &lt;function&gt;</li>
 * <li>&lt;value&gt; ::= any string </li>
 * <li>&lt;function&gt; ::= ${ &lt;functionContent&gt; }</li>
 * <li>&lt;functioncontent&gt; ::= &lt;functionName&gt;  : &lt;param&gt;</li>
 * <li>&lt;param&gt; ::= &lt;element&gt; * | &lt;element&gt; * : &lt;param&gt;</li>
 * <li>&lt;functionName&gt; ::= replace | replaceAll | replaceFirst | escape | escapePath | lower | upper | toLower | toUpper | trim | length</li>
 * </ul>
 * 
 * 
 * 
 */
package org.tuckey.web.filters.urlrewrite.substitution.interpreter;

