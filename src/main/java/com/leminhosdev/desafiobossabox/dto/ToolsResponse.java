package com.leminhosdev.desafiobossabox.dto;

import com.leminhosdev.desafiobossabox.entity.Tools;

import java.util.List;

public record ToolsResponse( Long id,String title, String link, String description, List<String> tags) {

}
