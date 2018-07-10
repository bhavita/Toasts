---


---

<h2 id="toasts">Toasts</h2>
<p>Toast your regular android <strong>Toasts</strong>.<br>
Toasts is a simple android library written with ❤️ in <strong>Kotlin</strong> to provide predefined and customizable toasts with styling and icon options. <strong>Toasts</strong> besides being customizable are as simple to use as Logs.</p>
<h2 id="screenshots">Screenshots</h2>
<p><img src="screenshots/Custom.png" alt="custom">                <img src="screenshots/Success.png" alt="success"></p>
<p><img src="screenshots/Warning.png" alt="warning">                <img src="screenshots/Info.png" alt="Info"></p>
<p><img src="screenshots/Error.png" alt="Error"></p>
<h2 id="usage">Usage</h2>
<p>Default Toasts<br>
#Success Toasts</p>
<pre><code>Toasts.s(this,getString(R.string.success_string),Toast.LENGTH_LONG).show()
</code></pre>
<p>#Warning Toast</p>
<pre><code>Toasts.w(this,getString(R.string.warning_string),Toast.LENGTH_LONG).show()
</code></pre>
<p>#Error Toasts</p>
<pre><code>Toasts.e(this, getString(R.string.error_string),Toast.LENGTH_LONG).show()
</code></pre>
<p>#Info Toasts</p>
<pre><code>Toasts.i(this,getString(R.string.info_string),Toast.LENGTH_LONG).show()
</code></pre>
<p>#Custom Toasts</p>
<pre><code>Toasts.c(this,getString(R.string.custom_string),Toast.LENGTH_LONG,icon,backgroundColor = Color.BLUE).show()
</code></pre>
<p>For all type of toasts,</p>
<ul>
<li>Context</li>
<li>Text</li>
<li>Duration are compulsory, all other parameters will be provided as per default if not supplied</li>
</ul>
<p>Remaining parameters</p>

<table>
<thead>
<tr>
<th>Parameter</th>
<th>Default Value</th>
<th>Compulsory</th>
</tr>
</thead>
<tbody>
<tr>
<td>Icon</td>
<td>Each interpreation has its own drawable</td>
<td>No</td>
</tr>
<tr>
<td>Text Color</td>
<td>Color.WHITE</td>
<td>No</td>
</tr>
<tr>
<td>Background Color</td>
<td>Each interpreation has its own color</td>
<td>No</td>
</tr>
<tr>
<td>TintIcon</td>
<td>false</td>
<td>No</td>
</tr>
</tbody>
</table><p>You can also define your toasts in following way if you want to set it up in your own order of arguments</p>
<p>//You can use in any order if variable = value method<br>
//You can define any of the attributes, remaining which you dont want to change would be taken up default</p>
<pre><code>        Toasts.c(
                textColor = Color.BLUE,
                icon = icon,
                backgroundColor = Color.GREEN,
                context = this,
                duration = 1,
                text = "well"
        ).show()
</code></pre>
<h2 id="are-custom-options-only-available-for-toasts.c">Are custom options only available for Toasts.c?</h2>
<p>No, all the variations can be applied to success, info, warning and error in a similar way.</p>
<h2 id="can-i-change-the-theme">Can I change the Theme?</h2>
<p>Success isn’t Green for everyone. Yes you can change the default values at any point of time</p>
<p>#Say</p>
<pre><code>    Toasts.set(textColor = Color.BLACK,
               errorColor = Color.BLUE)
</code></pre>
<p>#Any of these can be set , in any order, at any point of time</p>
<pre><code>  Toasts.set(
	 textColor =TEXT_COLOR,
	 defaultColor = COLOR,
	 successColor= SUCCESS_COLOR, 
	 errorColor = ERROR_COLOR,
     infoColor=INFO_COLOR, 
     warningColor= WARNING_COLOR)
</code></pre>
<h2 id="can-i-do-variations-with-the-toasts">Can I do variations with the Toasts?</h2>
<p>Yes, each method always returns an Android Toast object. So you can use this Toast object in whichever form you want. Dont forget to <em><strong>show</strong></em> Toasts.</p>
<h2 id="todo">ToDo</h2>
<ul>
<li class="task-list-item"><input type="checkbox" class="task-list-item-checkbox" disabled=""> Gravity Customizations</li>
<li class="task-list-item"><input type="checkbox" class="task-list-item-checkbox" disabled="">  Improvements</li>
<li class="task-list-item"><input type="checkbox" class="task-list-item-checkbox" disabled="">  Explore Download Url from Web and supply it to Toasts</li>
<li class="task-list-item"><input type="checkbox" class="task-list-item-checkbox" disabled="">  Explore Gradient backgrounds</li>
</ul>
<h2 id="contributions">Contributions</h2>
<p>This is my first project in Kotlin. This library was primarily developed to understand the functioning of Kotlin and library development. Will really appreciate all the contribution and feedbacks for the same.</p>
<h2 id="license">License</h2>
<p>MIT License</p>
<p>Copyright © 2018 Bhavita Lalwani</p>
<p>Permission is hereby granted, free of charge, to any person obtaining a copy<br>
of this software and associated documentation files (the “Software”), to deal<br>
in the Software without restriction, including without limitation the rights<br>
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell<br>
copies of the Software, and to permit persons to whom the Software is<br>
furnished to do so, subject to the following conditions:</p>
<p>The above copyright notice and this permission notice shall be included in all<br>
copies or substantial portions of the Software.</p>
<p>THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR<br>
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,<br>
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE<br>
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER<br>
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,<br>
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE<br>
SOFTWARE.</p>

