function x,y,z = parseData(filename)
    fileID = fopen('filename);
    dataXYZ = textscan(fileID,'%d  %d  %d');
    fclose(fileID);
    data = dataXYZ;
    x = data(:,1);
    y = data(:,2);
    z = data(:,3);
end