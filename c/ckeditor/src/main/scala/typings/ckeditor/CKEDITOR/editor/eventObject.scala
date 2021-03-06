package typings.ckeditor.CKEDITOR.editor

import typings.ckeditor.CKEDITOR.eventInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait eventObject extends js.Object {
  var activeEnterModeChange: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var activeFilterChange: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var afterCommandExec: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var afterInsertHtml: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var afterPaste: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var afterPasteFromWord: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var afterSetData: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var afterUndoImage: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var ariaEditorHelpLabel: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var ariaWidget: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var autogrow: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var beforeCommandExec: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var beforeDestroy: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var beforeGetData: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var beforeModeUnload: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var beforeSetMode: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var beforeUndoImage: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var blur: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var change: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var configLoaded: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var contentDirChanged: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var contentDom: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var contentDomInvalidated: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var contentDomUnload: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var customConfigLoaded: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var dataFiltered: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var dataReady: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var destroy: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var dialogHide: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var dialogShow: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var dirChanged: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var doubleclick: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var dragend: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var dragstart: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var drop: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var elementsPathUpdate: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var fileUploadRequest: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var fileUploadResponse: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var floatingSpaceLayout: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var focus: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var getData: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var getSnapshot: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var insertElement: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var insertHtml: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var insertText: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var instanceReady: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var key: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var langLoaded: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var loadSnapshot: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var loaded: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var lockSnapshot: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var maximize: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var menuShow: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var mode: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var notificationHide: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var notificationShow: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var notificationUpdate: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var paste: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var pasteFromWord: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var pluginsLoaded: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var readOnly: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var removeFormatCleanup: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var required: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var resize: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var save: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var saveSnapshot: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var selectionChange: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var setData: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var stylesSet: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var template: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var toDataFormat: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var toHtml: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var unlockSnapshot: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var updateSnapshot: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var widgetDefinition: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
}

object eventObject {
  @scala.inline
  def apply(
    activeEnterModeChange: /* evt */ eventInfo => Unit = null,
    activeFilterChange: /* evt */ eventInfo => Unit = null,
    afterCommandExec: /* evt */ eventInfo => Unit = null,
    afterInsertHtml: /* evt */ eventInfo => Unit = null,
    afterPaste: /* evt */ eventInfo => Unit = null,
    afterPasteFromWord: /* evt */ eventInfo => Unit = null,
    afterSetData: /* evt */ eventInfo => Unit = null,
    afterUndoImage: /* evt */ eventInfo => Unit = null,
    ariaEditorHelpLabel: /* evt */ eventInfo => Unit = null,
    ariaWidget: /* evt */ eventInfo => Unit = null,
    autogrow: /* evt */ eventInfo => Unit = null,
    beforeCommandExec: /* evt */ eventInfo => Unit = null,
    beforeDestroy: /* evt */ eventInfo => Unit = null,
    beforeGetData: /* evt */ eventInfo => Unit = null,
    beforeModeUnload: /* evt */ eventInfo => Unit = null,
    beforeSetMode: /* evt */ eventInfo => Unit = null,
    beforeUndoImage: /* evt */ eventInfo => Unit = null,
    blur: /* evt */ eventInfo => Unit = null,
    change: /* evt */ eventInfo => Unit = null,
    configLoaded: /* evt */ eventInfo => Unit = null,
    contentDirChanged: /* evt */ eventInfo => Unit = null,
    contentDom: /* evt */ eventInfo => Unit = null,
    contentDomInvalidated: /* evt */ eventInfo => Unit = null,
    contentDomUnload: /* evt */ eventInfo => Unit = null,
    customConfigLoaded: /* evt */ eventInfo => Unit = null,
    dataFiltered: /* evt */ eventInfo => Unit = null,
    dataReady: /* evt */ eventInfo => Unit = null,
    destroy: /* evt */ eventInfo => Unit = null,
    dialogHide: /* evt */ eventInfo => Unit = null,
    dialogShow: /* evt */ eventInfo => Unit = null,
    dirChanged: /* evt */ eventInfo => Unit = null,
    doubleclick: /* evt */ eventInfo => Unit = null,
    dragend: /* evt */ eventInfo => Unit = null,
    dragstart: /* evt */ eventInfo => Unit = null,
    drop: /* evt */ eventInfo => Unit = null,
    elementsPathUpdate: /* evt */ eventInfo => Unit = null,
    fileUploadRequest: /* evt */ eventInfo => Unit = null,
    fileUploadResponse: /* evt */ eventInfo => Unit = null,
    floatingSpaceLayout: /* evt */ eventInfo => Unit = null,
    focus: /* evt */ eventInfo => Unit = null,
    getData: /* evt */ eventInfo => Unit = null,
    getSnapshot: /* evt */ eventInfo => Unit = null,
    insertElement: /* evt */ eventInfo => Unit = null,
    insertHtml: /* evt */ eventInfo => Unit = null,
    insertText: /* evt */ eventInfo => Unit = null,
    instanceReady: /* evt */ eventInfo => Unit = null,
    key: /* evt */ eventInfo => Unit = null,
    langLoaded: /* evt */ eventInfo => Unit = null,
    loadSnapshot: /* evt */ eventInfo => Unit = null,
    loaded: /* evt */ eventInfo => Unit = null,
    lockSnapshot: /* evt */ eventInfo => Unit = null,
    maximize: /* evt */ eventInfo => Unit = null,
    menuShow: /* evt */ eventInfo => Unit = null,
    mode: /* evt */ eventInfo => Unit = null,
    notificationHide: /* evt */ eventInfo => Unit = null,
    notificationShow: /* evt */ eventInfo => Unit = null,
    notificationUpdate: /* evt */ eventInfo => Unit = null,
    paste: /* evt */ eventInfo => Unit = null,
    pasteFromWord: /* evt */ eventInfo => Unit = null,
    pluginsLoaded: /* evt */ eventInfo => Unit = null,
    readOnly: /* evt */ eventInfo => Unit = null,
    removeFormatCleanup: /* evt */ eventInfo => Unit = null,
    required: /* evt */ eventInfo => Unit = null,
    resize: /* evt */ eventInfo => Unit = null,
    save: /* evt */ eventInfo => Unit = null,
    saveSnapshot: /* evt */ eventInfo => Unit = null,
    selectionChange: /* evt */ eventInfo => Unit = null,
    setData: /* evt */ eventInfo => Unit = null,
    stylesSet: /* evt */ eventInfo => Unit = null,
    template: /* evt */ eventInfo => Unit = null,
    toDataFormat: /* evt */ eventInfo => Unit = null,
    toHtml: /* evt */ eventInfo => Unit = null,
    unlockSnapshot: /* evt */ eventInfo => Unit = null,
    updateSnapshot: /* evt */ eventInfo => Unit = null,
    widgetDefinition: /* evt */ eventInfo => Unit = null
  ): eventObject = {
    val __obj = js.Dynamic.literal()
    if (activeEnterModeChange != null) __obj.updateDynamic("activeEnterModeChange")(js.Any.fromFunction1(activeEnterModeChange))
    if (activeFilterChange != null) __obj.updateDynamic("activeFilterChange")(js.Any.fromFunction1(activeFilterChange))
    if (afterCommandExec != null) __obj.updateDynamic("afterCommandExec")(js.Any.fromFunction1(afterCommandExec))
    if (afterInsertHtml != null) __obj.updateDynamic("afterInsertHtml")(js.Any.fromFunction1(afterInsertHtml))
    if (afterPaste != null) __obj.updateDynamic("afterPaste")(js.Any.fromFunction1(afterPaste))
    if (afterPasteFromWord != null) __obj.updateDynamic("afterPasteFromWord")(js.Any.fromFunction1(afterPasteFromWord))
    if (afterSetData != null) __obj.updateDynamic("afterSetData")(js.Any.fromFunction1(afterSetData))
    if (afterUndoImage != null) __obj.updateDynamic("afterUndoImage")(js.Any.fromFunction1(afterUndoImage))
    if (ariaEditorHelpLabel != null) __obj.updateDynamic("ariaEditorHelpLabel")(js.Any.fromFunction1(ariaEditorHelpLabel))
    if (ariaWidget != null) __obj.updateDynamic("ariaWidget")(js.Any.fromFunction1(ariaWidget))
    if (autogrow != null) __obj.updateDynamic("autogrow")(js.Any.fromFunction1(autogrow))
    if (beforeCommandExec != null) __obj.updateDynamic("beforeCommandExec")(js.Any.fromFunction1(beforeCommandExec))
    if (beforeDestroy != null) __obj.updateDynamic("beforeDestroy")(js.Any.fromFunction1(beforeDestroy))
    if (beforeGetData != null) __obj.updateDynamic("beforeGetData")(js.Any.fromFunction1(beforeGetData))
    if (beforeModeUnload != null) __obj.updateDynamic("beforeModeUnload")(js.Any.fromFunction1(beforeModeUnload))
    if (beforeSetMode != null) __obj.updateDynamic("beforeSetMode")(js.Any.fromFunction1(beforeSetMode))
    if (beforeUndoImage != null) __obj.updateDynamic("beforeUndoImage")(js.Any.fromFunction1(beforeUndoImage))
    if (blur != null) __obj.updateDynamic("blur")(js.Any.fromFunction1(blur))
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (configLoaded != null) __obj.updateDynamic("configLoaded")(js.Any.fromFunction1(configLoaded))
    if (contentDirChanged != null) __obj.updateDynamic("contentDirChanged")(js.Any.fromFunction1(contentDirChanged))
    if (contentDom != null) __obj.updateDynamic("contentDom")(js.Any.fromFunction1(contentDom))
    if (contentDomInvalidated != null) __obj.updateDynamic("contentDomInvalidated")(js.Any.fromFunction1(contentDomInvalidated))
    if (contentDomUnload != null) __obj.updateDynamic("contentDomUnload")(js.Any.fromFunction1(contentDomUnload))
    if (customConfigLoaded != null) __obj.updateDynamic("customConfigLoaded")(js.Any.fromFunction1(customConfigLoaded))
    if (dataFiltered != null) __obj.updateDynamic("dataFiltered")(js.Any.fromFunction1(dataFiltered))
    if (dataReady != null) __obj.updateDynamic("dataReady")(js.Any.fromFunction1(dataReady))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (dialogHide != null) __obj.updateDynamic("dialogHide")(js.Any.fromFunction1(dialogHide))
    if (dialogShow != null) __obj.updateDynamic("dialogShow")(js.Any.fromFunction1(dialogShow))
    if (dirChanged != null) __obj.updateDynamic("dirChanged")(js.Any.fromFunction1(dirChanged))
    if (doubleclick != null) __obj.updateDynamic("doubleclick")(js.Any.fromFunction1(doubleclick))
    if (dragend != null) __obj.updateDynamic("dragend")(js.Any.fromFunction1(dragend))
    if (dragstart != null) __obj.updateDynamic("dragstart")(js.Any.fromFunction1(dragstart))
    if (drop != null) __obj.updateDynamic("drop")(js.Any.fromFunction1(drop))
    if (elementsPathUpdate != null) __obj.updateDynamic("elementsPathUpdate")(js.Any.fromFunction1(elementsPathUpdate))
    if (fileUploadRequest != null) __obj.updateDynamic("fileUploadRequest")(js.Any.fromFunction1(fileUploadRequest))
    if (fileUploadResponse != null) __obj.updateDynamic("fileUploadResponse")(js.Any.fromFunction1(fileUploadResponse))
    if (floatingSpaceLayout != null) __obj.updateDynamic("floatingSpaceLayout")(js.Any.fromFunction1(floatingSpaceLayout))
    if (focus != null) __obj.updateDynamic("focus")(js.Any.fromFunction1(focus))
    if (getData != null) __obj.updateDynamic("getData")(js.Any.fromFunction1(getData))
    if (getSnapshot != null) __obj.updateDynamic("getSnapshot")(js.Any.fromFunction1(getSnapshot))
    if (insertElement != null) __obj.updateDynamic("insertElement")(js.Any.fromFunction1(insertElement))
    if (insertHtml != null) __obj.updateDynamic("insertHtml")(js.Any.fromFunction1(insertHtml))
    if (insertText != null) __obj.updateDynamic("insertText")(js.Any.fromFunction1(insertText))
    if (instanceReady != null) __obj.updateDynamic("instanceReady")(js.Any.fromFunction1(instanceReady))
    if (key != null) __obj.updateDynamic("key")(js.Any.fromFunction1(key))
    if (langLoaded != null) __obj.updateDynamic("langLoaded")(js.Any.fromFunction1(langLoaded))
    if (loadSnapshot != null) __obj.updateDynamic("loadSnapshot")(js.Any.fromFunction1(loadSnapshot))
    if (loaded != null) __obj.updateDynamic("loaded")(js.Any.fromFunction1(loaded))
    if (lockSnapshot != null) __obj.updateDynamic("lockSnapshot")(js.Any.fromFunction1(lockSnapshot))
    if (maximize != null) __obj.updateDynamic("maximize")(js.Any.fromFunction1(maximize))
    if (menuShow != null) __obj.updateDynamic("menuShow")(js.Any.fromFunction1(menuShow))
    if (mode != null) __obj.updateDynamic("mode")(js.Any.fromFunction1(mode))
    if (notificationHide != null) __obj.updateDynamic("notificationHide")(js.Any.fromFunction1(notificationHide))
    if (notificationShow != null) __obj.updateDynamic("notificationShow")(js.Any.fromFunction1(notificationShow))
    if (notificationUpdate != null) __obj.updateDynamic("notificationUpdate")(js.Any.fromFunction1(notificationUpdate))
    if (paste != null) __obj.updateDynamic("paste")(js.Any.fromFunction1(paste))
    if (pasteFromWord != null) __obj.updateDynamic("pasteFromWord")(js.Any.fromFunction1(pasteFromWord))
    if (pluginsLoaded != null) __obj.updateDynamic("pluginsLoaded")(js.Any.fromFunction1(pluginsLoaded))
    if (readOnly != null) __obj.updateDynamic("readOnly")(js.Any.fromFunction1(readOnly))
    if (removeFormatCleanup != null) __obj.updateDynamic("removeFormatCleanup")(js.Any.fromFunction1(removeFormatCleanup))
    if (required != null) __obj.updateDynamic("required")(js.Any.fromFunction1(required))
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction1(resize))
    if (save != null) __obj.updateDynamic("save")(js.Any.fromFunction1(save))
    if (saveSnapshot != null) __obj.updateDynamic("saveSnapshot")(js.Any.fromFunction1(saveSnapshot))
    if (selectionChange != null) __obj.updateDynamic("selectionChange")(js.Any.fromFunction1(selectionChange))
    if (setData != null) __obj.updateDynamic("setData")(js.Any.fromFunction1(setData))
    if (stylesSet != null) __obj.updateDynamic("stylesSet")(js.Any.fromFunction1(stylesSet))
    if (template != null) __obj.updateDynamic("template")(js.Any.fromFunction1(template))
    if (toDataFormat != null) __obj.updateDynamic("toDataFormat")(js.Any.fromFunction1(toDataFormat))
    if (toHtml != null) __obj.updateDynamic("toHtml")(js.Any.fromFunction1(toHtml))
    if (unlockSnapshot != null) __obj.updateDynamic("unlockSnapshot")(js.Any.fromFunction1(unlockSnapshot))
    if (updateSnapshot != null) __obj.updateDynamic("updateSnapshot")(js.Any.fromFunction1(updateSnapshot))
    if (widgetDefinition != null) __obj.updateDynamic("widgetDefinition")(js.Any.fromFunction1(widgetDefinition))
    __obj.asInstanceOf[eventObject]
  }
}

