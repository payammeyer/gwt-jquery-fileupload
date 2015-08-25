package org.gwtjqueryfileupload.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import org.gwtbootstrap3.client.ui.Container;
import org.gwtbootstrap3.client.ui.Heading;
import org.gwtbootstrap3.client.ui.constants.HeadingSize;
import org.gwtjqueryfileupload.client.widget.JQueryBasic;

public class GWTJQueryFileUpload implements EntryPoint {

	private SimplePanel simplePanel;

	@Override
	public void onModuleLoad() {

		Container mainContainer = new Container();
		mainContainer.setMarginBottom(10);
		mainContainer.setMarginTop(10);
		mainContainer.setMarginLeft(10);
		mainContainer.setMarginRight(10);
		mainContainer.setFluid(true);

		Heading heading = new Heading(HeadingSize.H2);
		heading.setText("GWT JQuery File Upload");

		mainContainer.add(heading);

		JQueryBasic jqb = new JQueryBasic();

		mainContainer.add(jqb);

		simplePanel = new SimplePanel(mainContainer);
		RootLayoutPanel.get().add(simplePanel);

		jqb.init();
	}

}
