# Aspose.Cells Cloud SDK for Java 

- API version: 3.0
- SDK version: 20.1

This repository contains Aspose.Cells Cloud SDK for Java source code. This SDK allows you to work with Aspose.Cells Cloud REST APIs in your Java applications quickly and easily, with zero initial cost.



# Key Features

- Conversion between various document-related formats (20+ formats supported), including PDF<->Excel conversion

- Splitting Excel documents

- Accessing Excel document metadata and statistics

- Find and replace

- Watermarks and protection

- Full read & write access to Cells Object Model, including workbook, worksheet, cell, shapes, tables, list object ,ole Object,headers/footers and many others

  

See [API Reference](https://apireference.aspose.cloud/cells/) for full API specification.



# Storage API support

#### Since version 19.9 SDK includes support of storage operations for better user experience and unification, so now there's no need to use 2 different SDKs!

It gives you an ability to:

- Upload, download, copy, move and delete files, including versions handling (if you are using Cloud storage that supports this feature - true by default)
- Create, copy, move and delete folders
- Copy and move files and folders accross separate storages in scope of a single operation
- Check if certain file, folder or storage exists

# Licensing

All Aspose.Cells Cloud SDKs are licensed under [MIT License](https://github.com/aspose-cells-cloud/aspose-cells-cloud-java/blob/master/LICENSE)).



# How to use the SDK?

The complete source code is available in this repository folder. You can either directly use it in your project via source code or get [NuGet distribution](https://www.nuget.org/packages/Aspose.Cells-Cloud/) (recommended). For more details, please visit our [documentation website](https://docs.aspose.cloud/display/cellscloud/Available+SDKs#AvailableSDKs-.NET).

 

### Prerequisites

 

To use Aspose Cells Cloud SDK for Java you need to register an account with [Aspose Cloud](https://www.aspose.cloud/) and lookup/create App Key and SID at [Maven](https://mvnrepository.com/artifact/com.aspose/aspose-cloud-cells). There is free quota available. For more details, see [Aspose Cloud Pricing](https://purchase.aspose.cloud/pricing).

 

## Installation & Usage

 

Add this dependency to your project's POM:

 

```
<repositories>
    <repository>
        <id>AsposeJavaAPI</id>
        <name>Aspose Java API</name>
        <url>https://repository.aspose.cloud/repo/</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.aspose</groupId>
        <artifactId>aspose-cells-cloud</artifactId>
        <version>19.9.0</version>
    </dependency>
</dependencies>
```

 

## Getting Started

 

```
import com.aspose.cells.*;
import com.aspose.cells.client.*;
import com.aspose.cells.model.*;

import java.io.File;
import java.util.*;

public class WordsApiExample {

    public static void main(String[] args) {
        
        CellsApi cellsApi = new CellsApi();
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer columnIndex = 1;
        Integer columns = 1;
        Boolean updateReference = true;
        String folder = TEMPFOLDER;
        ColumnsResponse response = cellsApi.cellsDeleteWorksheetColumns(name, sheetName, columnIndex, columns, updateReference, folder,null);
    }
}
```

# Tests

[Tests](https://github.com/aspose-cells-cloud/aspose-cells-cloud-java/tree/master/src/test/java/com/aspose/cloud/cells/api) contain various examples of using the SDK.


# Contact Us

Your feedback is very important to us. Please feel free to contact via

- [**Free Support Forum**](https://forum.aspose.cloud/c/cells)
- [**Paid Support Helpdesk**](https://helpdesk.aspose.cloud/)

# Resources

- [**Web API reference**](https://apireference.aspose.cloud/cells/)
- [**Website**](https://www.aspose.cloud)
- [**Product Home**](https://products.aspose.cloud/cells)
- [**Documentation**](https://docs.aspose.cloud/display/cellscloud/Home)
- [**Blog**](https://blog.aspose.cloud/category/cells/)