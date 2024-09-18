# TemplateResponseObjectResourceAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the template | 
**editorType** | **String** | &#x60;editor_type&#x60; has a fixed set of values: * SYSTEM_DRAGGABLE: indicates a drag-and-drop editor template * SIMPLE: A rich text editor template * CODE: A custom HTML template * USER_DRAGGABLE: A hybrid template, using custom HTML in the drag-and-drop editor | 
**html** | **String** | The rendered HTML of the template | 
**text** | **String** | The template plain_text |  [optional]
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The date the template was created in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm) |  [optional]
**updated** | [**OffsetDateTime**](OffsetDateTime.md) | The date the template was updated in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm) |  [optional]
