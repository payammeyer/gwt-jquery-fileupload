package org.gwtjqueryfileupload.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import org.gwtbootstrap3.client.ui.Button;
import org.gwtbootstrap3.client.ui.Column;
import org.gwtbootstrap3.client.ui.Form;
import org.gwtbootstrap3.client.ui.Icon;
import org.gwtbootstrap3.client.ui.Input;
import org.gwtbootstrap3.client.ui.Row;
import org.gwtbootstrap3.client.ui.constants.ButtonType;
import org.gwtbootstrap3.client.ui.constants.ColumnSize;
import org.gwtbootstrap3.client.ui.constants.IconPosition;
import org.gwtbootstrap3.client.ui.constants.IconType;
import org.gwtbootstrap3.client.ui.constants.InputType;
import org.gwtbootstrap3.client.ui.html.Span;
import org.gwtjqueryfileupload.shared.js.GWTJQueryClientBundle;

/**
 * Created by Payam Meyer on 8/24/15.
 */
public class JQueryBasic extends Form {

	private static GWTJQueryClientBundle bundle = GWT.create(GWTJQueryClientBundle.class);

	static {
		ScriptInjector.fromString(bundle.jquery().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
		ScriptInjector.fromString(bundle.jqueryUiWidget().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
		ScriptInjector.fromString(bundle.jqueryIFrameTransport().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
		ScriptInjector.fromString(bundle.jqueryFileupload().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
	}

	public JQueryBasic() {
		this.getElement().setId("fileupload");
		this.setAction("//jquery-file-upload.appspot.com/");
		this.setMethod("POST");
		this.setEncoding("multipart/form-data");

		Row buttonsRow = new Row();
		buttonsRow.addStyleName("fileupload-buttonbar");

		Column buttonsColumn = new Column(ColumnSize.LG_7);
		buttonsRow.add(buttonsColumn);

		Span span = new Span();
		span.addStyleName("btn btn-success fileinput-button");
		Icon addIcon = new Icon(IconType.PLUS);
		addIcon.setMarginRight(3);
		Span addFilesSpan = new Span("Add files...");

		Input input = new Input(InputType.FILE);
		input.setName("files[]");

		span.add(addIcon);
		span.add(addFilesSpan);
		span.add(input);

		Button submitButton = new Button("Start upload");
		submitButton.setType(ButtonType.PRIMARY);
		submitButton.setMarginLeft(5);
		submitButton.setIcon(IconType.UPLOAD);
		submitButton.setIconPosition(IconPosition.LEFT);
		submitButton.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent clickEvent) {
				//initFileUpload();
			}
		});

		Button cancelButton = new Button("Cancel upload");
		cancelButton.setType(ButtonType.WARNING);
		cancelButton.setMarginLeft(5);
		cancelButton.setIcon(IconType.BAN);
		cancelButton.setIconPosition(IconPosition.LEFT);

		Button deleteButton = new Button("Delete");
		deleteButton.setType(ButtonType.DANGER);
		deleteButton.setMarginLeft(5);
		deleteButton.setIcon(IconType.TRASH);
		deleteButton.setIconPosition(IconPosition.LEFT);

		buttonsColumn.add(span);
		buttonsColumn.add(submitButton);
		buttonsColumn.add(cancelButton);
		buttonsColumn.add(deleteButton);

		this.add(buttonsRow);

	}

	public final native void init() /*-{
        $wnd.jQuery("#fileupload").fileupload();
    }-*/;

}
