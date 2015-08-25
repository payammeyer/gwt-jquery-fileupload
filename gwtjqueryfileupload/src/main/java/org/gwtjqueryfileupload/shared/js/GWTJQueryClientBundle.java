package org.gwtjqueryfileupload.shared.js;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

/**
 * Created by Payam Meyer on 8/25/15.
 */
public interface GWTJQueryClientBundle extends ClientBundle {

	@Source("main.js")
	TextResource main();

	@Source("jquery.fileupload.js")
	TextResource jqueryFileupload();

	@Source("jquery-1.11.3.js")
	TextResource jquery();

	@Source("vendor/jquery.ui.widget.js")
	TextResource jqueryUiWidget();

	@Source("jquery.iframe-transport.js")
	TextResource jqueryIFrameTransport();

}
