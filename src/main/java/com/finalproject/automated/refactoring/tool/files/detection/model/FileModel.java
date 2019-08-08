package com.finalproject.automated.refactoring.tool.files.detection.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author Dufan Quraish
 * @version 1.0.0
 * @since 8 August 2019
 */

@Data
@Builder
@ToString(exclude = "content")
@EqualsAndHashCode(exclude = "content")
public class FileModel {

    private String path;

    private String filename;

    private String content;
}
